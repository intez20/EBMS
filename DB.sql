create user ebms identified by psc
/
grant dba to ebms
/
conn ebms/psc
/
create table user_info
(user_id varchar(100),
user_name varchar(100),
user_mobile number(25),
user_email varchar(40)
)
/
create table login
(login_user_id varchar(40),
login_role_id varchar(40),
question varchar(100),
login_user_password varchar(25),
answer varchar(100)
)
/
create table customer_details
(cus_id varchar(100),
cus_add varchar(100),
cus_areatype varchar(50),
cus_name varchar(100),
cus_mobile varchar(100),
cus_email varchar(100),
cus_verification varchar(100),
verification_no varchar(100),
conn_date varchar(100),
conn_id varchar(100),
cus_photo blob
)
/
create table connections
(
conn_id varchar(100),
conn_type varchar(100),
fixed_charge number(25),
energy_charge number(25)
)
/
create table meter
(
meter_no varchar(100),
meter_type varchar(100),
meter_rent number(30)
)

/
create table bill_cycle
(
bill_id varchar(50),
meter_no varchar(60),
fixed_charge number(25),
prev_reading number(25),
curr_reading number(25),
total_consume number(25),
total_amount number(25),
electric_duty number(25),
other_charges number(25),
govt_subsidy number(25),
due_date varchar(70),
gross_total number(25),
)
/
create table payment
(
payment_id varchar(40),
paid_amount number(30),
pay_mode varchar(40),
paid_date varchar(40),
bill_id varchar(40)
)
/