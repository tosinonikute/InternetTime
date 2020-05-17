package com.s.internettime;


import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MainPresenterTest {

    private MainPresenter presenter;
    private SimpleDateFormat formatter;

    @Before
    public void before() {
        formatter = mock(SimpleDateFormat.class);
    }

    @Test
    public void startDate_and_endDateTest() {
        MainListView view = mock(MainListView.class);

        presenter = new MainPresenter();
        presenter.attachView(view);

        when(formatter.format(any(Date.class))).thenReturn(TimeZone.getDefault().getDisplayName());

        presenter.getStatus();

        verify(view).showStatus("Jan 01, 2019", "Jan 01, 2020");
    }
}
