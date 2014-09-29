/*
Test SQL file to test correct parsing
:named_parameters in multiline comments should be ignored
*/
SELECT col1, col2 -- :named_parameters in comments should be ignored
FROM table
WHERE id = :named_parameter1
AND name = :named_parameter2;