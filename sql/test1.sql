-- SELECT @@autocommit;

-- CREATE TABLE testt(
--	flg INT);
	
-- COMMIT;

-- INSERT INTO testt(flg)
-- VALUES(0);

-- SELECT COUNT(*) done
-- FROM testt
-- WHERE flg = 1;
SELECT FLOOR(SUM(case when flg=1 then 1 ELSE 0 END)/COUNT(*)*100) AS comp_per
FROM testt;