SELECT * FROM poisepms.project;
UPDATE project set DEADLINE = "" WHERE CUST_ID = "";
UPDATE project set AMOUNT_PAID = "";
UPDATE contractor set PHONE_NUM = "",EMAIL = "" WHERE ID = "";
UPDATE project set FINALISED = "" WHERE CUST_ID;
 