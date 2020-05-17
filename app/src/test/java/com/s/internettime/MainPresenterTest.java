package com.s.internettime;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainPresenterTest {

    private MainPresenter presenter;

    @InjectMocks
    DateFormat formatter;

    @Before
    public void before() {

    }

    @Test
    public void startDate_and_endDateTest() {
        MainListView view = mock(MainListView.class);

        presenter = new MainPresenter();
        presenter.attachView(view);

        Mockito.when(formatter.format(any(Date.class))).thenReturn(TimeZone.getDefault().getDisplayName());

        presenter.getStatus();

        verify(view).showStatus("Nov 01, 2019", "Nov 01, 2020");
    }
}
