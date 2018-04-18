package vn.nguyen.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import vn.nguyen.Model.User;
import vn.nguyen.service.SecurityService;
import vn.nguyen.service.UserDAO;
import vn.nguyen.service.UserService;


import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

/**
 * Created by nals on 2/7/18.
 */
public class UserServiceImplTest {

    @Mock
    private UserService userService;
    @Mock
    private UserDAO userDAO;
    @Mock
    private SecurityService securityService;
    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        userServiceImpl = new UserServiceImpl(userService,userDAO,securityService);
    }

    @Test
    public void getPasswordService() throws Exception {
    }

    @Test
    public void setPasswordService() throws Exception {
    }

    @Test
    public void assignPassword() throws Exception {
        User userReal = preparedUser();
        User spy = spy(userReal);
        String passwordMd5 = securityService.md5(userService.getPasswordService());
        userDAO.updateUser(userService);

        ArgumentCaptor<UserService> argumentUserCaptor = ArgumentCaptor.forClass(UserService.class);
        verify(userDAO).updateUser(argumentUserCaptor.capture());
        verify(userService).getPasswordService();

        UserServiceImpl spyImpl = Mockito.spy(userServiceImpl);
        Mockito.doNothing().when(spyImpl).assignPassword(userService);
        assertEquals("md5",spyImpl.md5("md5"));
        doReturn("456").when(spyImpl).getPasswordService();
        assertEquals("abc",spy.getUsername());
        assertEquals("abc",userReal.getUsername());
        assertEquals("456",spyImpl.getPasswordService());
    }

    @Test
    public void testfindById_ShouldReturnUserWhenUserIdFound() throws Exception {
        User userPrepare = preparedUser();
        when(userDAO.findById("u01")).thenReturn(userPrepare);
        User expected = userServiceImpl.findById("u01");
        assertThat(expected.getUserId()).isEqualTo(userPrepare.getUserId());

    }

    private User preparedUser() {
        User user = new User("u01","abc", "123");
        return user;
    }
}