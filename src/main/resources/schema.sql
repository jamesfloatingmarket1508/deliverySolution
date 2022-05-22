DROP TABLE  IF EXISTS  JOBS;



CREATE TABLE JOBS (
     id LONG auto_increment PRIMARY KEY,
     jobname VARCHAR(100),
     location VARCHAR(100),
     notice VARCHAR(200),
     clientid VARCHAR(100),
     des_job VARCHAR(200),
     delivery_date varchar(20),
     delivery_time varchar(20),
     status varchar(200),
     driver_id varchar(20)


);

DROP TABLE IF EXISTS ITEM;
CREATE TABLE ITEM (
                      id LONG auto_increment PRIMARY KEY,
                      jobid Long,
                      description VARCHAR(100),
                      status VARCHAR(100)
);

ALTER TABLE ITEM
    ADD FOREIGN KEY (jobId)
        REFERENCES JOBS(id);