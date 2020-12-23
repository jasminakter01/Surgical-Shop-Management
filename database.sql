/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.0.45-community-nt : Database - sergical_shop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sergical_shop` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `sergical_shop`;

/*Table structure for table `bank_data` */

DROP TABLE IF EXISTS `bank_data`;

CREATE TABLE `bank_data` (
  `bank_name` varchar(100) default NULL,
  `account_number` varchar(500) default NULL,
  `status` varchar(100) default NULL,
  `detailse` varchar(500) default NULL,
  `ammount` varchar(500) default NULL,
  `date` date default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bank_data` */

insert  into `bank_data`(`bank_name`,`account_number`,`status`,`detailse`,`ammount`,`date`) values ('Islami bank','201032005','Debit','Product Purchase','1000','2020-10-22'),('Prime bank','1234536523643274','Debit','Product Purchase','1000','2020-10-22'),('Islami bank','201032005','Debit','Product Purchase','400','2020-10-22');

/*Table structure for table `bank_name` */

DROP TABLE IF EXISTS `bank_name`;

CREATE TABLE `bank_name` (
  `name` varchar(500) default NULL,
  `number` varchar(500) default NULL,
  `date` date default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bank_name` */

insert  into `bank_name`(`name`,`number`,`date`) values ('AB Bank','201032001','2020-10-08'),('Dutch bangla','3330044005990','2020-10-11'),('Premium bank','320010023344949834','2020-10-11'),('Prime bank','1234536523643274','2020-10-11'),('Islami bank','201032005','2020-10-11'),('hhBank','12345643234567','2020-10-11'),('KK BAnk','28399876338828911223','2020-10-13');

/*Table structure for table `cash_table` */

DROP TABLE IF EXISTS `cash_table`;

CREATE TABLE `cash_table` (
  `date` date default NULL,
  `ammount` varchar(500) default NULL,
  `status` varchar(100) default NULL,
  `detailse` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cash_table` */

insert  into `cash_table`(`date`,`ammount`,`status`,`detailse`) values ('2020-10-22','50000.0','Debit','Product Purchase'),('2020-10-22','60','Debit','Product Purchase'),('2019-10-17','1500.0','Debit','Product Purchase'),('2020-10-22','2000.0','Credit','Product Sales'),('2020-10-22','1500.0','Credit','Product Sales'),('2020-10-22','90','Debit','Product Purchase'),('2020-10-23','1000','Credit','Product Sales'),('2020-10-23','1500','Credit','Product Sales'),('2020-10-23','90','Credit','Product Sales'),('2020-10-23','100','Credit','Product Sales'),('2020-10-23','0.0','Credit','Product Sales'),('2020-10-22','1500.0','Debit','Product Purchase'),('2020-10-22','60','Debit','Product Purchase'),('2020-10-22','995.0','Debit','Product Purchase'),('2020-10-22','100.0','Debit','Product Purchase'),('2020-10-22','50','Debit','Product Purchase'),('2020-10-22','50','Debit','Product Purchase'),('2020-10-22','1500','Credit','Product Sales'),('2020-10-22','2590','Debit','Product Purchase'),('2020-10-24','150','Credit','Product Sales');

/*Table structure for table `category_table` */

DROP TABLE IF EXISTS `category_table`;

CREATE TABLE `category_table` (
  `category` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `category_table` */

insert  into `category_table`(`category`) values ('Catagory 1'),('Catagory 2'),('Catagory 3'),('Catagory 4'),('Catagory 5'),('Mouse'),('pc');

/*Table structure for table `cost` */

DROP TABLE IF EXISTS `cost`;

CREATE TABLE `cost` (
  `cost_type` varchar(200) default NULL,
  `bill_no` varchar(200) default NULL,
  `detailse` varchar(300) default NULL,
  `ammount` varchar(500) default NULL,
  `paidby` varchar(200) default NULL,
  `current_date` date default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cost` */

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `cu_id` varchar(200) default NULL,
  `cu_name` varchar(200) default NULL,
  `shop_name` varchar(200) default NULL,
  `number` varchar(100) default NULL,
  `address` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`cu_id`,`cu_name`,`shop_name`,`number`,`address`) values ('1','Rakib','Albaraka','01887765543','Feni'),('2','Juwel','Vitul-1','01887736644','Feni');

/*Table structure for table `purchase` */

DROP TABLE IF EXISTS `purchase`;

CREATE TABLE `purchase` (
  `su_name` varchar(200) default NULL,
  `purchase_bill_no` varchar(200) default NULL,
  `Catagory` varchar(200) default NULL,
  `product_name` varchar(300) default NULL,
  `pu_date` date default NULL,
  `pu_quantity` varchar(500) default NULL,
  `pu_price` varchar(500) default NULL,
  `payment` varchar(500) default NULL,
  `status` varchar(100) default 'normal'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `purchase` */

insert  into `purchase`(`su_name`,`purchase_bill_no`,`Catagory`,`product_name`,`pu_date`,`pu_quantity`,`pu_price`,`payment`,`status`) values ('SM Surgicale','1','Catagory 1','ECG','2020-10-22','3','30','90.0','normal'),('SM Surgicale','1','Catagory 1','Belt','2020-10-22','97.0','500.0','48500.0','Return'),('RS Surgicale','2','Catagory 1','MT','2020-10-22','28.0','40','1120.0','Return'),('RS Surgicale','2','Catagory 1','ECG','2020-10-22','2','30','60.0','normal'),('SM Surgicale','3','Catagory 1','Belt','2019-10-17','3','500','1500.0','normal'),('SM Surgicale','3','Catagory 1','ECG','2019-10-17','3','30','90.0','normal'),('SM Surgicale','5','Catagory 1','Belt','2020-10-22','2','500','1000.0','preorder'),('SM Surgicale','5','Catagory 1','ECG','2020-10-22','3','30','90.0','normal'),('SM Surgicale','11','Catagory 1','Belt','2020-10-22','2.0','500.0','1000.0','normal'),('SM Surgicale','15','Catagory 1','Belt','2020-10-22','3.0','500.0','1500.0','normal'),('SM Surgicale','16','Catagory 1','Belt','2020-10-22','3','500.0','1500.0','preorder'),('SM Surgicale','16','Catagory 1','ECG','2020-10-22','2','30','60.0','normal'),('RS Surgicale','rs1','Catagory 1','Belt','2020-10-22','2','500.0','1000.0','normal'),('SM Surgicale','12','Catagory 1','ECG','2020-10-22','2','30','60.0','normal'),('SM Surgicale','12','Catagory 1','Belt','2020-10-22','4','500.0','2000.0','normal'),('RS Surgicale','13','Catagory 1','Belt','2020-10-22','2','500.0','1000.0','normal'),('RS Surgicale','13','Catagory 1','ECG','2020-10-22','4','30','120.0','normal'),('SM Surgicale','14','Catagory 1','ECG','2020-10-22','5','30','150.0','normal'),('SM Surgicale','111','Catagory 1','ECG','2020-10-22','4','30','120.0','normal'),('SM Surgicale','1222','Catagory 1','ECG','2020-10-22','4','30','120.0','normal'),('RS Surgicale','123','Catagory 1','Belt','2020-10-22','2','500.0','1000.0','normal'),('SM Surgicale','125','Catagory 1','ECG','2020-10-22','3','30','90.0','preorder'),('SM Surgicale','125','Catagory 1','Belt','2020-10-22','5','500.0','2500.0','preorder');

/*Table structure for table `purchase_account` */

DROP TABLE IF EXISTS `purchase_account`;

CREATE TABLE `purchase_account` (
  `bill_no` varchar(200) default NULL,
  `date` varchar(100) default NULL,
  `company` varchar(200) default NULL,
  `total_item` varchar(300) default NULL,
  `sub_total` varchar(500) default NULL,
  `discount` varchar(500) default NULL,
  `paid` varchar(500) default NULL,
  `due` varchar(500) default NULL,
  `status` varchar(100) default 'normal'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `purchase_account` */

insert  into `purchase_account`(`bill_no`,`date`,`company`,`total_item`,`sub_total`,`discount`,`paid`,`due`,`status`) values ('1','2020-10-22','SM Surgicale','2.0','50090.0','90','50000.0','0.0','Cash'),('2','2020-10-22','RS Surgicale','2.0','1260.0','0','60','1200.0','Cash'),('3','2019-10-17','SM Surgicale','2.0','1590.0','90','1500.0','0.0','Cash'),('5','2020-10-22','SM Surgicale','2.0','1090.0','0','90','1000.0','Cash'),('15','2020-10-22','SM Surgicale','1.0','1500.0','0','1500.0','0.0','Cash'),('16','2020-10-22','SM Surgicale','2.0','1560.0','0','60','1500.0','Cash'),('rs1','2020-10-22','RS Surgicale','1.0','1000.0','5','995.0','0.0','Cash'),('12','2020-10-22','SM Surgicale','2.0','2060.0','80','1000','980.0','Check'),('13','2020-10-22','RS Surgicale','2.0','1120.0','90','1000','30.0','Check'),('14','2020-10-22','SM Surgicale','1.0','150.0','50','100.0','0.0','Cash'),('111','2020-10-22','SM Surgicale','1.0','120.0','20','50','50.0','Cash'),('1222','2020-10-22','SM Surgicale','1.0','120.0','20','50','50.0','Cash'),('123','2020-10-22','RS Surgicale','1.0','1000.0','50','400','550.0','Check'),('125','2020-10-22','SM Surgicale','2.0','2590.0','0','2590','0.0','Cash');

/*Table structure for table `purchase_order` */

DROP TABLE IF EXISTS `purchase_order`;

CREATE TABLE `purchase_order` (
  `pur_order_id` varchar(200) default NULL,
  `company_name` varchar(200) default NULL,
  `catagory` varchar(200) default NULL,
  `pur_product_name` varchar(200) default NULL,
  `pur_product_price` varchar(500) default NULL,
  `pur_product_quantity` varchar(500) default NULL,
  `total` varchar(500) default NULL,
  `pur_order_date` date default NULL,
  `pur_delevery_date` date default NULL,
  `status` varchar(50) default 'order'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `purchase_order` */

insert  into `purchase_order`(`pur_order_id`,`company_name`,`catagory`,`pur_product_name`,`pur_product_price`,`pur_product_quantity`,`total`,`pur_order_date`,`pur_delevery_date`,`status`) values ('2','SM Surgicale','Catagory 1','Belt','500','2','1000.0','2020-10-22','2020-10-23','delivery'),('15','SM Surgicale','Catagory 1','Belt','500.0','3','1500.0','2020-10-23','2020-10-24','delivery'),('3','SM Surgicale','Catagory 1','Belt','500.0','2','1000.0','2020-10-22','2020-10-23','order'),('123','SM Surgicale','Catagory 1','ECG','30','3','90.0','2020-10-22','2020-10-24','delivery'),('123','SM Surgicale','Catagory 1','Belt','500.0','5','2500.0','2020-10-22','2020-10-24','delivery');

/*Table structure for table `sales_acoount` */

DROP TABLE IF EXISTS `sales_acoount`;

CREATE TABLE `sales_acoount` (
  `bill_no` varchar(200) default NULL,
  `date` varchar(100) default NULL,
  `company` varchar(100) default NULL,
  `total_item` varchar(300) default NULL,
  `sub_total` varchar(500) default NULL,
  `discount` varchar(500) default NULL,
  `paid` varchar(500) default NULL,
  `due` varchar(500) default NULL,
  `status` varchar(100) default 'normal'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sales_acoount` */

insert  into `sales_acoount`(`bill_no`,`date`,`company`,`total_item`,`sub_total`,`discount`,`paid`,`due`,`status`) values ('1','2020-10-22','Albaraka || Rakib','1.0','2500.0','500','2000.0','0.0','Cash'),('2','2020-10-22','jasmin','1.0','1500.0','0','1500.0','0.0','Cash'),('7','2020-10-23','Albaraka || Rakib','2.0','1090.0','0','90','1000.0','Cash'),('10','2020-10-23','Albaraka || Rakib','1.0','1000.0','0','100','900.0','Cash'),('11','2020-10-23','Albaraka || Rakib','1.0','500.0','500','0.0','0.0','Cash'),('1221','2020-10-22','Albaraka || Rakib','3.0','2750.0','50','1500','1200.0','Cash'),('133','2020-10-24','Vitul-1 || Juwel','1.0','150.0','0','150','0.0','Cash');

/*Table structure for table `sales_officer` */

DROP TABLE IF EXISTS `sales_officer`;

CREATE TABLE `sales_officer` (
  `so_id` varchar(200) default NULL,
  `so_name` varchar(200) default NULL,
  `so_posssition` varchar(100) default NULL,
  `so_address` varchar(300) default NULL,
  `so_phone` varchar(100) default NULL,
  `so_joindate` date default NULL,
  `refaral_persion` varchar(100) default NULL,
  `refaral_phone` varchar(100) default NULL,
  `salary` varchar(500) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sales_officer` */

insert  into `sales_officer`(`so_id`,`so_name`,`so_posssition`,`so_address`,`so_phone`,`so_joindate`,`refaral_persion`,`refaral_phone`,`salary`) values ('12','Roni','nurch','ehu5','34566556','2020-10-22','NA','NA','23.0');

/*Table structure for table `sales_order` */

DROP TABLE IF EXISTS `sales_order`;

CREATE TABLE `sales_order` (
  `order_id` varchar(200) default NULL,
  `customer_name` varchar(200) default NULL,
  `Catagory` varchar(200) default NULL,
  `product_name` varchar(200) default NULL,
  `product_price` varchar(500) default NULL,
  `product_quantity` varchar(500) default NULL,
  `total` varchar(500) default NULL,
  `order_date` date default NULL,
  `delivery_date` date default NULL,
  `status` varchar(50) default 'order'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sales_order` */

insert  into `sales_order`(`order_id`,`customer_name`,`Catagory`,`product_name`,`product_price`,`product_quantity`,`total`,`order_date`,`delivery_date`,`status`) values ('6','Albaraka || Rakib','Catagory 1','Belt','500','2','1000.0','2020-10-22','2020-10-23','order'),('1','Albaraka || Rakib','Catagory 1','Belt','500','2','1000.0','2020-10-22','2020-10-23','delivery'),('2','Albaraka || Rakib','Catagory 1','Belt','500','2','1000.0','2020-10-22','2020-10-23','delivery'),('6','Albaraka || Rakib','Catagory 1','ECG','30','3','90.0','2020-10-22','2020-10-23','order'),('2','Albaraka || Rakib','Catagory 1','Belt','500','2','1000.0','2020-10-22','2020-10-23','delivery'),('8','Albaraka || Rakib','Catagory 1','ECG','30','2','60.0','2020-10-22','2020-10-23','delivery'),('10','Albaraka || Rakib','Catagory 1','Belt','500.0','2','1000.0','2020-10-22','2020-10-23','delivery'),('11','Albaraka || Rakib','Catagory 1','Belt','500.0','2','1000.0','2020-10-23','2020-10-24','delivery'),('133','Vitul-1 || Juwel','Catagory 1','ECG','30','5','150.0','2020-10-22','2020-10-24','delivery');

/*Table structure for table `sales_table` */

DROP TABLE IF EXISTS `sales_table`;

CREATE TABLE `sales_table` (
  `cus_name` varchar(200) default NULL,
  `sales_bill_no` varchar(200) default NULL,
  `Catagory` varchar(100) default NULL,
  `product_name` varchar(200) default NULL,
  `s_date` date default NULL,
  `s_quantity` varchar(500) default '0',
  `s_price` varchar(500) default NULL,
  `total` varchar(500) default NULL,
  `status` varchar(100) default 'normal',
  `SR` varchar(100) default 'NA'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sales_table` */

insert  into `sales_table`(`cus_name`,`sales_bill_no`,`Catagory`,`product_name`,`s_date`,`s_quantity`,`s_price`,`total`,`status`,`SR`) values ('Albaraka || Rakib','1','Catagory 1','Belt','2020-10-22','5','500','2500.0','normal','NA'),('jasmin','2','Catagory 1','Belt','2020-10-22','1.0','500.0','500.0','Return','NA'),('Albaraka || Rakib','6','Catagory 1','Belt','2020-10-23','3','500','1500.0','normal','NA'),('Albaraka || Rakib','2.0','Catagory 1','Belt','2020-10-23','2.0','500.0','1000.0','preorder','NA'),('Albaraka || Rakib','2.0','Catagory 1','Belt','2020-10-23','2.0','500.0','1000.0','preorder','NA'),('Albaraka || Rakib','7','Catagory 1','Belt','2020-10-23','2.0','500.0','1000.0','preorder','NA'),('Albaraka || Rakib','7','Catagory 1','ECG','2020-10-23','3','30','90.0','normal','NA'),('Albaraka || Rakib','8','Catagory 1','ECG','2020-10-23','2.0','30.0','60.0','preorder','NA'),('Albaraka || Rakib','8','Catagory 1','Belt','2020-10-23','2','500','1000.0','normal','NA'),('Albaraka || Rakib','8','Catagory 1','MT','2020-10-23','2','40','80.0','normal','NA'),('Albaraka || Rakib','9','Catagory 1','Belt','2020-10-23','2','500','1000.0','normal','NA'),('Albaraka || Rakib','34','Catagory 1','Belt','2020-10-23','3','500.0','1500.0','normal','NA'),('Albaraka || Rakib','10','Catagory 1','Belt','2020-10-22','2','500.0','1000.0','normal','NA'),('Albaraka || Rakib','10','Catagory 1','Belt','2020-10-23','2.0','500.0','1000.0','preorder','NA'),('Albaraka || Rakib','11','Catagory 1','Belt','2020-10-23','1','500.0','500.0','normal','NA'),('Albaraka || Rakib','12','Catagory 1','Belt','2020-10-24','2.0','500.0','1000.0','preorder','NA'),('Albaraka || Rakib','12','Catagory 1','ECG','2020-10-24','3','30.5','91.5','normal','NA'),('Albaraka || Rakib','1221','Catagory 1','ECG','2020-10-22','3','30','90.0','normal','NA'),('Albaraka || Rakib','1221','Catagory 1','MT','2020-10-22','4','40','160.0','normal','NA'),('Albaraka || Rakib','1221','Catagory 1','Belt','2020-10-22','5','500.0','2500.0','normal','NA'),('Vitul-1 || Juwel','133','Catagory 1','ECG','2020-10-24','5.0','30.0','150.0','preorder','NA');

/*Table structure for table `sr_salery` */

DROP TABLE IF EXISTS `sr_salery`;

CREATE TABLE `sr_salery` (
  `id` varchar(500) default NULL,
  `name` varchar(200) default NULL,
  `address` varchar(200) default NULL,
  `position` varchar(200) default NULL,
  `salery` varchar(500) default NULL,
  `date` date default NULL,
  `mobile` varchar(100) default NULL,
  `pay_status` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sr_salery` */

/*Table structure for table `suplier_table` */

DROP TABLE IF EXISTS `suplier_table`;

CREATE TABLE `suplier_table` (
  `su_id` varchar(100) default NULL,
  `su_company_name` varchar(500) default NULL,
  `company_address` varchar(500) default NULL,
  `su_name` varchar(100) default NULL,
  `su_phone` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `suplier_table` */

insert  into `suplier_table`(`su_id`,`su_company_name`,`company_address`,`su_name`,`su_phone`) values ('1','SM Surgicale','Dhaka','abir','01887765543'),('2','RS Surgicale','Dhaka','Ahmed','01887765444');

/*Table structure for table `user_accounts` */

DROP TABLE IF EXISTS `user_accounts`;

CREATE TABLE `user_accounts` (
  `id` varchar(100) default NULL,
  `username` varchar(100) default NULL,
  `password` int(100) default NULL,
  `status` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_accounts` */

insert  into `user_accounts`(`id`,`username`,`password`,`status`) values ('1','jasmin',12345,'user'),('1','Jasmin Akter',1234567,'User');

/*Table structure for table `user_id` */

DROP TABLE IF EXISTS `user_id`;

CREATE TABLE `user_id` (
  `id` varchar(100) default NULL,
  `status` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_id` */

insert  into `user_id`(`id`,`status`) values ('1','user');

/*Table structure for table `bank_credit_amount` */

DROP TABLE IF EXISTS `bank_credit_amount`;

/*!50001 DROP VIEW IF EXISTS `bank_credit_amount` */;
/*!50001 DROP TABLE IF EXISTS `bank_credit_amount` */;

/*!50001 CREATE TABLE  `bank_credit_amount`(
 `C_ammount` double 
)*/;

/*Table structure for table `bank_debit_amount` */

DROP TABLE IF EXISTS `bank_debit_amount`;

/*!50001 DROP VIEW IF EXISTS `bank_debit_amount` */;
/*!50001 DROP TABLE IF EXISTS `bank_debit_amount` */;

/*!50001 CREATE TABLE  `bank_debit_amount`(
 `C_ammount` double 
)*/;

/*Table structure for table `bank_total` */

DROP TABLE IF EXISTS `bank_total`;

/*!50001 DROP VIEW IF EXISTS `bank_total` */;
/*!50001 DROP TABLE IF EXISTS `bank_total` */;

/*!50001 CREATE TABLE  `bank_total`(
 `bank_debit` double ,
 `bank_Credit` double 
)*/;

/*Table structure for table `cash_credt_amount` */

DROP TABLE IF EXISTS `cash_credt_amount`;

/*!50001 DROP VIEW IF EXISTS `cash_credt_amount` */;
/*!50001 DROP TABLE IF EXISTS `cash_credt_amount` */;

/*!50001 CREATE TABLE  `cash_credt_amount`(
 `c_ammount` double 
)*/;

/*Table structure for table `cash_debit_amount` */

DROP TABLE IF EXISTS `cash_debit_amount`;

/*!50001 DROP VIEW IF EXISTS `cash_debit_amount` */;
/*!50001 DROP TABLE IF EXISTS `cash_debit_amount` */;

/*!50001 CREATE TABLE  `cash_debit_amount`(
 `d_ammount` double 
)*/;

/*Table structure for table `cash_total` */

DROP TABLE IF EXISTS `cash_total`;

/*!50001 DROP VIEW IF EXISTS `cash_total` */;
/*!50001 DROP TABLE IF EXISTS `cash_total` */;

/*!50001 CREATE TABLE  `cash_total`(
 `cash_debit` double ,
 `cash_Credit` double 
)*/;

/*Table structure for table `order_acc` */

DROP TABLE IF EXISTS `order_acc`;

/*!50001 DROP VIEW IF EXISTS `order_acc` */;
/*!50001 DROP TABLE IF EXISTS `order_acc` */;

/*!50001 CREATE TABLE  `order_acc`(
 `pur_order_id` varchar(200) ,
 `company_name` varchar(200) ,
 `pur_order_date` date ,
 `pur_delevery_date` date ,
 `total` double ,
 `status` varchar(50) 
)*/;

/*Table structure for table `order_sales` */

DROP TABLE IF EXISTS `order_sales`;

/*!50001 DROP VIEW IF EXISTS `order_sales` */;
/*!50001 DROP TABLE IF EXISTS `order_sales` */;

/*!50001 CREATE TABLE  `order_sales`(
 `order_id` varchar(200) ,
 `customer_name` varchar(200) ,
 `order_date` date ,
 `delivery_date` date ,
 `total` double ,
 `status` varchar(50) 
)*/;

/*Table structure for table `pur_quantity` */

DROP TABLE IF EXISTS `pur_quantity`;

/*!50001 DROP VIEW IF EXISTS `pur_quantity` */;
/*!50001 DROP TABLE IF EXISTS `pur_quantity` */;

/*!50001 CREATE TABLE  `pur_quantity`(
 `Catagory` varchar(200) ,
 `product` varchar(300) ,
 `pur_quantity` double 
)*/;

/*Table structure for table `sales_quantity` */

DROP TABLE IF EXISTS `sales_quantity`;

/*!50001 DROP VIEW IF EXISTS `sales_quantity` */;
/*!50001 DROP TABLE IF EXISTS `sales_quantity` */;

/*!50001 CREATE TABLE  `sales_quantity`(
 `Catagory` varchar(100) ,
 `product` varchar(200) ,
 `s_quantity` double 
)*/;

/*Table structure for table `stock` */

DROP TABLE IF EXISTS `stock`;

/*!50001 DROP VIEW IF EXISTS `stock` */;
/*!50001 DROP TABLE IF EXISTS `stock` */;

/*!50001 CREATE TABLE  `stock`(
 `Catagory` varchar(200) ,
 `product` varchar(300) ,
 `pur` double ,
 `sales` double 
)*/;

/*Table structure for table `total_cradit` */

DROP TABLE IF EXISTS `total_cradit`;

/*!50001 DROP VIEW IF EXISTS `total_cradit` */;
/*!50001 DROP TABLE IF EXISTS `total_cradit` */;

/*!50001 CREATE TABLE  `total_cradit`(
 `bank_credit` double ,
 `cash_credit` double 
)*/;

/*Table structure for table `total_debit` */

DROP TABLE IF EXISTS `total_debit`;

/*!50001 DROP VIEW IF EXISTS `total_debit` */;
/*!50001 DROP TABLE IF EXISTS `total_debit` */;

/*!50001 CREATE TABLE  `total_debit`(
 `bank_debit` double ,
 `cash_debit` double 
)*/;

/*View structure for view bank_credit_amount */

/*!50001 DROP TABLE IF EXISTS `bank_credit_amount` */;
/*!50001 DROP VIEW IF EXISTS `bank_credit_amount` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `bank_credit_amount` AS (select sum(`bank_data`.`ammount`) AS `C_ammount` from `bank_data` where (`bank_data`.`status` = _latin1'Credit')) */;

/*View structure for view bank_debit_amount */

/*!50001 DROP TABLE IF EXISTS `bank_debit_amount` */;
/*!50001 DROP VIEW IF EXISTS `bank_debit_amount` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `bank_debit_amount` AS (select sum(`bank_data`.`ammount`) AS `C_ammount` from `bank_data` where (`bank_data`.`status` = _latin1'Debit')) */;

/*View structure for view bank_total */

/*!50001 DROP TABLE IF EXISTS `bank_total` */;
/*!50001 DROP VIEW IF EXISTS `bank_total` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `bank_total` AS (select `bank_debit_amount`.`C_ammount` AS `bank_debit`,`bank_credit_amount`.`C_ammount` AS `bank_Credit` from (`bank_debit_amount` join `bank_credit_amount`)) */;

/*View structure for view cash_credt_amount */

/*!50001 DROP TABLE IF EXISTS `cash_credt_amount` */;
/*!50001 DROP VIEW IF EXISTS `cash_credt_amount` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `cash_credt_amount` AS (select sum(`cash_table`.`ammount`) AS `c_ammount` from `cash_table` where (`cash_table`.`status` = _latin1'Credit')) */;

/*View structure for view cash_debit_amount */

/*!50001 DROP TABLE IF EXISTS `cash_debit_amount` */;
/*!50001 DROP VIEW IF EXISTS `cash_debit_amount` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `cash_debit_amount` AS (select sum(`cash_table`.`ammount`) AS `d_ammount` from `cash_table` where (`cash_table`.`status` = _latin1'Debit')) */;

/*View structure for view cash_total */

/*!50001 DROP TABLE IF EXISTS `cash_total` */;
/*!50001 DROP VIEW IF EXISTS `cash_total` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `cash_total` AS (select `cash_debit_amount`.`d_ammount` AS `cash_debit`,`cash_credt_amount`.`c_ammount` AS `cash_Credit` from (`cash_debit_amount` join `cash_credt_amount`)) */;

/*View structure for view order_acc */

/*!50001 DROP TABLE IF EXISTS `order_acc` */;
/*!50001 DROP VIEW IF EXISTS `order_acc` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `order_acc` AS (select `purchase_order`.`pur_order_id` AS `pur_order_id`,`purchase_order`.`company_name` AS `company_name`,`purchase_order`.`pur_order_date` AS `pur_order_date`,`purchase_order`.`pur_delevery_date` AS `pur_delevery_date`,sum(`purchase_order`.`total`) AS `total`,`purchase_order`.`status` AS `status` from `purchase_order` group by `purchase_order`.`pur_order_id`) */;

/*View structure for view order_sales */

/*!50001 DROP TABLE IF EXISTS `order_sales` */;
/*!50001 DROP VIEW IF EXISTS `order_sales` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `order_sales` AS (select `sales_order`.`order_id` AS `order_id`,`sales_order`.`customer_name` AS `customer_name`,`sales_order`.`order_date` AS `order_date`,`sales_order`.`delivery_date` AS `delivery_date`,sum(`sales_order`.`total`) AS `total`,`sales_order`.`status` AS `status` from `sales_order` group by `sales_order`.`customer_name`) */;

/*View structure for view pur_quantity */

/*!50001 DROP TABLE IF EXISTS `pur_quantity` */;
/*!50001 DROP VIEW IF EXISTS `pur_quantity` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `pur_quantity` AS (select `purchase`.`Catagory` AS `Catagory`,`purchase`.`product_name` AS `product`,sum(`purchase`.`pu_quantity`) AS `pur_quantity` from `purchase` group by `purchase`.`product_name`) */;

/*View structure for view sales_quantity */

/*!50001 DROP TABLE IF EXISTS `sales_quantity` */;
/*!50001 DROP VIEW IF EXISTS `sales_quantity` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `sales_quantity` AS (select `sales_table`.`Catagory` AS `Catagory`,`sales_table`.`product_name` AS `product`,sum(`sales_table`.`s_quantity`) AS `s_quantity` from `sales_table` group by `sales_table`.`product_name`) */;

/*View structure for view stock */

/*!50001 DROP TABLE IF EXISTS `stock` */;
/*!50001 DROP VIEW IF EXISTS `stock` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `stock` AS (select `pur_quantity`.`Catagory` AS `Catagory`,`pur_quantity`.`product` AS `product`,`pur_quantity`.`pur_quantity` AS `pur`,`sales_quantity`.`s_quantity` AS `sales` from (`pur_quantity` left join `sales_quantity` on((`pur_quantity`.`product` = `sales_quantity`.`product`)))) */;

/*View structure for view total_cradit */

/*!50001 DROP TABLE IF EXISTS `total_cradit` */;
/*!50001 DROP VIEW IF EXISTS `total_cradit` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `total_cradit` AS (select `bank_credit_amount`.`C_ammount` AS `bank_credit`,`cash_credt_amount`.`c_ammount` AS `cash_credit` from (`bank_credit_amount` join `cash_credt_amount`)) */;

/*View structure for view total_debit */

/*!50001 DROP TABLE IF EXISTS `total_debit` */;
/*!50001 DROP VIEW IF EXISTS `total_debit` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `total_debit` AS (select `bank_debit_amount`.`C_ammount` AS `bank_debit`,`cash_debit_amount`.`d_ammount` AS `cash_debit` from (`bank_debit_amount` join `cash_debit_amount`)) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
