package st.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import st.project.demo.entites.Message;
import st.project.demo.repositories.MessageDao;

@Service
public class MessageServiceImpl implements MessageService{
    @Autowired
    private MessageDao messageDao;
    public Message getMessageById(Long id){return messageDao.getById(id);}

}
