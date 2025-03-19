create sequence education_seq start with 1 increment by 50;
create sequence job_seq start with 1 increment by 50;
create sequence person_seq start with 1 increment by 50;
create sequence resume_seq start with 1 increment by 50;
create table education (education_id bigint, graduation timestamp(6), id bigint not null, degree varchar(255), university varchar(255), primary key (id));
create table job (date_ended timestamp(6), date_started timestamp(6), id bigint not null, job_id bigint, resume_id bigint, company_city varchar(255), company_name varchar(255), company_state varchar(255), description varchar(255), technology varchar(255), title varchar(255), primary key (id));
create table person (id bigint not null, city varchar(255), email_address varchar(255), first_name varchar(255), last_name varchar(255), phone_number varchar(255), state varchar(255), primary key (id));
create table resume (education_id bigint unique, id bigint not null, person_id bigint, primary key (id));
alter table if exists job add constraint FKk46tk6m954jis2aniw3ulmp16 foreign key (resume_id) references resume;
alter table if exists resume add constraint FKckhi63e1k2vxbaloq8pem32f5 foreign key (education_id) references education;
alter table if exists resume add constraint FK8lak4hba5s4rixc3mhd0bkld7 foreign key (person_id) references person;
