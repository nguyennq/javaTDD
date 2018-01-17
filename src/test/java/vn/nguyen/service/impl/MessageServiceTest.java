package vn.nguyen.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.nguyen.Model.Message;
import vn.nguyen.service.IMessage;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
/**
 * Created by nals on 11/29/17.
 */
//@RunWith(MockitoJUnitRunner.class)
public class MessageServiceTest {
    private static final Logger log = LoggerFactory.getLogger(MessageServiceTest.class);
    @Mock
    private IMessage iMessage;
    @InjectMocks
    private MessageService messageService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        messageService = new MessageService(iMessage);
    }

    @Test
    public void testTimeFrame_SouldReturnMorningWhenTimeFrameIsMorning() throws Exception {
        Message message = preparedMessage("Morning");

        when(iMessage.timeFrame("Morning")).thenReturn(message);
//        when(iMessage.timeFrame(anyString())).th.classenAnswer(new Answer<Message>() {
//            public Message answer(InvocationOnMock invocationOnMock) throws Throwable {
//                return (Message)invocationOnMock.getArguments()[0];
//            }
//        });
        Message messAcutal = messageService.timeFrame("Morning");
        assertEquals("Good Morning",messAcutal.getGreeting());
        verifyNoMoreInteractions(iMessage);

    }

    @Test
    public void testTimeFrame_ShouldReturnAfternoonWhenTimeFrameIsAfternoon() throws Exception {
        //given
        Message message = preparedMessage("Afternoon");
        //when
        Message expectedMessage = messageService.timeFrame("Afternoon");
        //then
        log.info("timeFrame() - verify method call and return correct ");
        assertThat(expectedMessage.getTimeLine()).isEqualTo(message.getTimeLine());
    }

    private Message preparedMessage(String timeLine) {
        Message message = new Message();
        message.setTimeLine(timeLine);
        message.setGreeting("Good Morning");
        return message;
    }

}