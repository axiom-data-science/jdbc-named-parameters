package com.axiomalaska.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.List;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import com.axiomalaska.jdbc.NamedParameterPreparedStatement;
import com.axiomalaska.jdbc.NamedParameterPreparedStatement.ParseResult;
import com.google.common.collect.Lists;

public class TestNamedParameterPreparedStatement {
    @Test
    public void testParsing(){
        String testQuery = "SELECT * FROM table WHERE afield = ':not me' AND bfield = :param1 AND cfield = :param2 and dfield = :param2;";
        String expectedParsedQuery = "SELECT * FROM table WHERE afield = ':not me' AND bfield = ? AND cfield = ? and dfield = ?;";
        List<String> expectedParameterList = Lists.newArrayList("param1", "param2", "param2");
        ParseResult parseResult = NamedParameterPreparedStatement.parse(testQuery);
        assertEquals(expectedParsedQuery, parseResult.getSql());
        assertThat(expectedParameterList, is(parseResult.getOrderedParameters()));
    }
}
