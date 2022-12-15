package st.project.demo.services;

import org.springframework.stereotype.Service;
import st.project.demo.entites.Message;
import st.project.demo.repositories.MessageDao;

@Service
public class MessageService {
    private final MessageDao messageDao;

    public MessageService(MessageDao messageDao) {
        this.messageDao = messageDao;
    }
    public Message getMessageById(Long id){return messageDao.getById(id);}

}
