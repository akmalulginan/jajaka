/*
Navicat SQLite Data Transfer

Source Server         : tttttttttt
Source Server Version : 30714
Source Host           : :0

Target Server Type    : SQLite
Target Server Version : 30714
File Encoding         : 65001

Date: 2016-01-16 13:22:39
*/

PRAGMA foreign_keys = OFF;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS "main"."item";
CREATE TABLE "item" (
"kodeItem"  varchar(25) NOT NULL,
"barcode"  varchar(25) NOT NULL,
"namaBarang"  varchar(50) NOT NULL,
"kategori"  varchar(50) NOT NULL,
"satuan"  varchar(10) NOT NULL,
"dapatDibeli"  tinyint(1) DEFAULT NULL,
"dapatDijual"  tinyint(1) DEFAULT NULL,
"dapatDiproduksi"  tinyint(1) DEFAULT NULL,
"dipakaiUntukProduksi"  tinyint(1) DEFAULT NULL,
"dapatDibongkar"  tinyint(1) DEFAULT NULL,
"statusBarang"  tinyint(1) DEFAULT NULL,
"gambar"  blob NOT NULL,
"keterangan"  text NOT NULL,
PRIMARY KEY ("kodeItem")
);
