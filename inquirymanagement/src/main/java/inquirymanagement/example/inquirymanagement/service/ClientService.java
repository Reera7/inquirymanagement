package inquirymanagement.example.inquirymanagement.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import inquirymanagement.example.inquirymanagement.dto.ClientDto;
import inquirymanagement.example.inquirymanagement.entity.ClientEntity;
import inquirymanagement.example.inquirymanagement.repository.ClientRepository;

@Service
public class ClientService {

  private final ClientRepository clientRepository;

  public ClientService(ClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

  // 顧客名取得
  public List<ClientDto> getClientList() {
    List<ClientEntity> clientEntityList = clientRepository.findByDeleteFlagIsFalse();
    List<ClientDto> clientList = new ArrayList<>();

    for (ClientEntity clientEntity : clientEntityList) {
      ClientDto client = new ClientDto();
      client.setClientId(clientEntity.getClientId());
      client.setClientName(clientEntity.getClientName());
      clientList.add(client);
    }
    return clientList;
  }
}
