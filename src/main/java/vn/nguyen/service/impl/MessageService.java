package vn.nguyen.service.impl;

import vn.nguyen.Model.Message;
import vn.nguyen.service.IMessage;

/**
 * Created by nals on 11/29/17.
 */
public class MessageService implements IMessage {
    private IMessage iMessage;

    public MessageService(IMessage iMessage) {
        this.iMessage = iMessage;
    }

    public Message timeFrame(String timeLine) {
        Message message = new Message();
        if(timeLine.equals("Morning")){
            message.setGreeting("Good Morning");
            message.setTimeLine("Morning");
            return message;
        }
        else if(timeLine.equals("Afternoon")){
            message.setGreeting("Good Afternoon");
            message.setTimeLine("Afternoon");
            return message;
        }
        else {
            message.setGreeting("Good Evening");
            message.setTimeLine("Evening");
            return message;
        }
    }
}
