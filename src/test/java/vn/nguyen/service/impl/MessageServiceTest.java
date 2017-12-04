package vn.nguyen.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import vn.nguyen.Model.Message;
import vn.nguyen.service.IMessage;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

/**
 * Created by nals on 11/29/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class MessageServiceTest {
    @Mock
    private IMessage iMessage;
    @InjectMocks
    private MessageService messageService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(IMessage.class);
        messageService = new MessageService(iMessage);
    }

    @Test
    public void testTimeFrameWhenInputValidParameter() throws Exception {
        Message message = preparedMessage();
        when(iMessage.timeFrame("Morning")).thenReturn(message);
//        when(iMessage.timeFrame(anyString())).th.classenAnswer(new Answer<Message>() {
//            public Message answer(InvocationOnMock invocationOnMock) throws Throwable {
//                return (Message)invocationOnMock.getArguments()[0];
//            }
//        });
        Message messAcutal = messageService.timeFrame("Morning");
        assertEquals("Good Morning",messAcutal.getGreeting());
        verify(iMessage).timeFrame(anyString());
        verifyNoMoreInteractions(iMessage);

    }

    private Message preparedMessage() {
        Message message = new Message();
        message.setTimeLine("Morning");
        message.setGreeting("Good Morning");
        return message;
    }

}