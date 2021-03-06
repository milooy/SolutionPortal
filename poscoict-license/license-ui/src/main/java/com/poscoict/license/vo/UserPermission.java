package com.poscoict.license.vo;

public class UserPermission {
	private boolean MENU_NOTICE = false;
	private boolean FUNCTION_NOTICE_WRITE = false;
	
	private boolean MENU_GLUE = false;
	private boolean FUNCTION_GLUE_ADMIN = false;
	private boolean FUNCTION_GLUE_WRITE = false;
	private boolean FUNCTION_GLUE_WRITE_NOTICE = false;
	private boolean FUNCTION_GLUE_WRITE_QNA = false;
	private boolean FUNCTION_GLUE_REPLY_BOARD_QNA = false;
	private boolean FUNCTION_GLUE_WRITE_FAQ = false;
	private boolean FUNCTION_GLUE_WRITE_TECH = false;
	private boolean FUNCTION_GLUE_WRITE_OLDTECH = false;
	private boolean FUNCTION_GLUE_REPLY = false;
	
	
	private boolean MENU_GLUEMASTER = false;
	private boolean FUNCTION_GLUEMASTER_ADMIN = false;
	private boolean FUNCTION_GLUEMASTER_WRITE = false;
	private boolean FUNCTION_GLUEMASTER_WRITE_NOTICE = false;
	private boolean FUNCTION_GLUEMASTER_WRITE_QNA = false;
	private boolean FUNCTION_GLUEMASTER_REPLY_BOARD_QNA = false;
	private boolean FUNCTION_GLUEMASTER_WRITE_FAQ = false;
	private boolean FUNCTION_GLUEMASTER_WRITE_TECH = false;
	private boolean FUNCTION_GLUEMASTER_REPLY = false;
	
	private boolean MENU_GLUEMOBILE = false;
	private boolean FUNCTION_GLUEMOBILE_ADMIN = false;
	private boolean FUNCTION_GLUEMOBILE_WRITE = false;
	private boolean FUNCTION_GLUEMOBILE_WRITE_NOTICE = false;
	private boolean FUNCTION_GLUEMOBILE_WRITE_QNA = false;
	private boolean FUNCTION_GLUEMOBILE_REPLY_BOARD_QNA = false;
	private boolean FUNCTION_GLUEMOBILE_WRITE_FAQ = false;
	private boolean FUNCTION_GLUEMOBILE_WRITE_TECH = false;
	private boolean FUNCTION_GLUEMOBILE_REPLY = false;
	
	private boolean MENU_UCUBE = false;
	private boolean FUNCTION_UCUBE_ADMIN = false;
	private boolean FUNCTION_UCUBE_WRITE = false;
	private boolean FUNCTION_UCUBE_WRITE_NOTICE = false;
	private boolean FUNCTION_UCUBE_WRITE_QNA = false;
	private boolean FUNCTION_UCUBE_REPLY_BOARD_QNA = false;
	private boolean FUNCTION_UCUBE_WRITE_FAQ = false;
	private boolean FUNCTION_UCUBE_WRITE_TECH = false;
	private boolean FUNCTION_UCUBE_REPLY = false;
	
	private boolean MENU_POSBEE = false;
	private boolean FUNCTION_POSBEE_ADMIN = false;
	private boolean FUNCTION_POSBEE_WRITE = false;
	private boolean FUNCTION_POSBEE_WRITE_NOTICE = false;
	private boolean FUNCTION_POSBEE_WRITE_QNA = false;
	private boolean FUNCTION_POSBEE_REPLY_BOARD_QNA = false;
	private boolean FUNCTION_POSBEE_WRITE_FAQ = false;
	private boolean FUNCTION_POSBEE_WRITE_TECH = false;
	private boolean FUNCTION_POSBEE_REPLY = false;
	
	private boolean MENU_SOLUTION_UPLOAD = false;
	private boolean FUNCTION_SOLUTION_UPLOAD_GLUE = false;
	private boolean FUNCTION_SOLUTION_UPLOAD_GLUEMASTER = false;
	private boolean FUNCTION_SOLUTION_UPLOAD_UCUBE = false;
	private boolean FUNCTION_SOLUTION_UPLOAD_POSBEE = false;
	private boolean FUNCTION_SOLUTION_UPLOAD_ETC = false;
	private boolean FUNCTION_SOLUTION_UPLOAD_ORDER_COMPANY = false;
	private boolean FUNCTION_SOLUTION_UPLOAD_CUSTOM_USER = false;
	private boolean FUNCTION_SOLUTION_UPLOAD_GLUEMOBILE = false;
	
	private boolean MENU_PRESENTATION = false;
	private boolean MENU_GUEST_PACKAGE_DOWNLOAD = false;
	private boolean MENU_USER_PACKAGE_DOWNLOAD = false;
	
	private boolean MENU_MANAGEMENT = false;
	private boolean SUB_MENU_MANAGEMENT_COMPLETE = false;
	private boolean FUNCTION_MANAGEMENT_INPUT_USER = false;
	private boolean SUB_MENU_MANAGEMENT_PROGRESS = false;
	private boolean FUNCTION_PROGRESS_INPUT_USER = false;
	private boolean FUNCTION_PROGRESS_COMMENT = false;
	
	private boolean MENU_CUSTOMBOARD = false;
	
	public boolean isMENU_GLUEMOBILE() {
		return MENU_GLUEMOBILE;
	}
	public void setMENU_GLUEMOBILE(boolean mENU_GLUEMOBILE) {
		MENU_GLUEMOBILE = mENU_GLUEMOBILE;
	}
	public boolean isFUNCTION_GLUEMOBILE_ADMIN() {
		return FUNCTION_GLUEMOBILE_ADMIN;
	}
	public void setFUNCTION_GLUEMOBILE_ADMIN(boolean fUNCTION_GLUEMOBILE_ADMIN) {
		FUNCTION_GLUEMOBILE_ADMIN = fUNCTION_GLUEMOBILE_ADMIN;
	}
	public boolean isFUNCTION_GLUEMOBILE_WRITE() {
		return FUNCTION_GLUEMOBILE_WRITE;
	}
	public void setFUNCTION_GLUEMOBILE_WRITE(boolean fUNCTION_GLUEMOBILE_WRITE) {
		FUNCTION_GLUEMOBILE_WRITE = fUNCTION_GLUEMOBILE_WRITE;
	}
	public boolean isFUNCTION_GLUEMOBILE_WRITE_NOTICE() {
		return FUNCTION_GLUEMOBILE_WRITE_NOTICE;
	}
	public void setFUNCTION_GLUEMOBILE_WRITE_NOTICE(
			boolean fUNCTION_GLUEMOBILE_WRITE_NOTICE) {
		FUNCTION_GLUEMOBILE_WRITE_NOTICE = fUNCTION_GLUEMOBILE_WRITE_NOTICE;
	}
	public boolean isFUNCTION_GLUEMOBILE_WRITE_QNA() {
		return FUNCTION_GLUEMOBILE_WRITE_QNA;
	}
	public void setFUNCTION_GLUEMOBILE_WRITE_QNA(
			boolean fUNCTION_GLUEMOBILE_WRITE_QNA) {
		FUNCTION_GLUEMOBILE_WRITE_QNA = fUNCTION_GLUEMOBILE_WRITE_QNA;
	}
	public boolean isFUNCTION_GLUEMOBILE_REPLY_BOARD_QNA() {
		return FUNCTION_GLUEMOBILE_REPLY_BOARD_QNA;
	}
	public void setFUNCTION_GLUEMOBILE_REPLY_BOARD_QNA(
			boolean fUNCTION_GLUEMOBILE_REPLY_BOARD_QNA) {
		FUNCTION_GLUEMOBILE_REPLY_BOARD_QNA = fUNCTION_GLUEMOBILE_REPLY_BOARD_QNA;
	}
	public boolean isFUNCTION_GLUEMOBILE_WRITE_FAQ() {
		return FUNCTION_GLUEMOBILE_WRITE_FAQ;
	}
	public void setFUNCTION_GLUEMOBILE_WRITE_FAQ(
			boolean fUNCTION_GLUEMOBILE_WRITE_FAQ) {
		FUNCTION_GLUEMOBILE_WRITE_FAQ = fUNCTION_GLUEMOBILE_WRITE_FAQ;
	}
	public boolean isFUNCTION_GLUEMOBILE_WRITE_TECH() {
		return FUNCTION_GLUEMOBILE_WRITE_TECH;
	}
	public void setFUNCTION_GLUEMOBILE_WRITE_TECH(
			boolean fUNCTION_GLUEMOBILE_WRITE_TECH) {
		FUNCTION_GLUEMOBILE_WRITE_TECH = fUNCTION_GLUEMOBILE_WRITE_TECH;
	}
	public boolean isFUNCTION_GLUEMOBILE_REPLY() {
		return FUNCTION_GLUEMOBILE_REPLY;
	}
	public void setFUNCTION_GLUEMOBILE_REPLY(boolean fUNCTION_GLUEMOBILE_REPLY) {
		FUNCTION_GLUEMOBILE_REPLY = fUNCTION_GLUEMOBILE_REPLY;
	}
	public boolean isFUNCTION_SOLUTION_UPLOAD_GLUEMOBILE() {
		return FUNCTION_SOLUTION_UPLOAD_GLUEMOBILE;
	}
	public void setFUNCTION_SOLUTION_UPLOAD_GLUEMOBILE(
			boolean fUNCTION_SOLUTION_UPLOAD_GLUEMOBILE) {
		FUNCTION_SOLUTION_UPLOAD_GLUEMOBILE = fUNCTION_SOLUTION_UPLOAD_GLUEMOBILE;
	}
	public boolean isFUNCTION_GLUE_ADMIN() {
		return FUNCTION_GLUE_ADMIN;
	}
	public void setFUNCTION_GLUE_ADMIN(boolean fUNCTION_GLUE_ADMIN) {
		FUNCTION_GLUE_ADMIN = fUNCTION_GLUE_ADMIN;
	}
	public boolean isFUNCTION_GLUEMASTER_ADMIN() {
		return FUNCTION_GLUEMASTER_ADMIN;
	}
	public void setFUNCTION_GLUEMASTER_ADMIN(boolean fUNCTION_GLUEMASTER_ADMIN) {
		FUNCTION_GLUEMASTER_ADMIN = fUNCTION_GLUEMASTER_ADMIN;
	}
	public boolean isFUNCTION_UCUBE_ADMIN() {
		return FUNCTION_UCUBE_ADMIN;
	}
	public void setFUNCTION_UCUBE_ADMIN(boolean fUNCTION_UCUBE_ADMIN) {
		FUNCTION_UCUBE_ADMIN = fUNCTION_UCUBE_ADMIN;
	}
	public boolean isFUNCTION_POSBEE_ADMIN() {
		return FUNCTION_POSBEE_ADMIN;
	}
	public void setFUNCTION_POSBEE_ADMIN(boolean fUNCTION_POSBEE_ADMIN) {
		FUNCTION_POSBEE_ADMIN = fUNCTION_POSBEE_ADMIN;
	}
	public boolean isMENU_CUSTOMBOARD() {
		return MENU_CUSTOMBOARD;
	}
	public void setMENU_CUSTOMBOARD(boolean mENU_CUSTOMBOARD) {
		MENU_CUSTOMBOARD = mENU_CUSTOMBOARD;
	}
	public boolean isMENU_POSBEE() {
		return MENU_POSBEE;
	}
	public void setMENU_POSBEE(boolean mENU_POSBEE) {
		MENU_POSBEE = mENU_POSBEE;
	}
	public boolean isFUNCTION_POSBEE_WRITE() {
		return FUNCTION_POSBEE_WRITE;
	}
	public void setFUNCTION_POSBEE_WRITE(boolean fUNCTION_POSBEE_WRITE) {
		FUNCTION_POSBEE_WRITE = fUNCTION_POSBEE_WRITE;
	}
	public boolean isFUNCTION_POSBEE_WRITE_NOTICE() {
		return FUNCTION_POSBEE_WRITE_NOTICE;
	}
	public void setFUNCTION_POSBEE_WRITE_NOTICE(boolean fUNCTION_POSBEE_WRITE_NOTICE) {
		FUNCTION_POSBEE_WRITE_NOTICE = fUNCTION_POSBEE_WRITE_NOTICE;
	}
	public boolean isFUNCTION_POSBEE_WRITE_QNA() {
		return FUNCTION_POSBEE_WRITE_QNA;
	}
	public void setFUNCTION_POSBEE_WRITE_QNA(boolean fUNCTION_POSBEE_WRITE_QNA) {
		FUNCTION_POSBEE_WRITE_QNA = fUNCTION_POSBEE_WRITE_QNA;
	}
	public boolean isFUNCTION_POSBEE_REPLY_BOARD_QNA() {
		return FUNCTION_POSBEE_REPLY_BOARD_QNA;
	}
	public void setFUNCTION_POSBEE_REPLY_BOARD_QNA(
			boolean fUNCTION_POSBEE_REPLY_BOARD_QNA) {
		FUNCTION_POSBEE_REPLY_BOARD_QNA = fUNCTION_POSBEE_REPLY_BOARD_QNA;
	}
	public boolean isFUNCTION_POSBEE_WRITE_FAQ() {
		return FUNCTION_POSBEE_WRITE_FAQ;
	}
	public void setFUNCTION_POSBEE_WRITE_FAQ(boolean fUNCTION_POSBEE_WRITE_FAQ) {
		FUNCTION_POSBEE_WRITE_FAQ = fUNCTION_POSBEE_WRITE_FAQ;
	}
	public boolean isFUNCTION_POSBEE_WRITE_TECH() {
		return FUNCTION_POSBEE_WRITE_TECH;
	}
	public void setFUNCTION_POSBEE_WRITE_TECH(boolean fUNCTION_POSBEE_WRITE_TECH) {
		FUNCTION_POSBEE_WRITE_TECH = fUNCTION_POSBEE_WRITE_TECH;
	}
	public boolean isFUNCTION_POSBEE_REPLY() {
		return FUNCTION_POSBEE_REPLY;
	}
	public void setFUNCTION_POSBEE_REPLY(boolean fUNCTION_POSBEE_REPLY) {
		FUNCTION_POSBEE_REPLY = fUNCTION_POSBEE_REPLY;
	}
	public boolean isMENU_NOTICE() {
		return MENU_NOTICE;
	}
	public void setMENU_NOTICE(boolean mENU_NOTICE) {
		MENU_NOTICE = mENU_NOTICE;
	}
	public boolean isFUNCTION_NOTICE_WRITE() {
		return FUNCTION_NOTICE_WRITE;
	}
	public void setFUNCTION_NOTICE_WRITE(boolean fUNCTION_NOTICE_WRITE) {
		FUNCTION_NOTICE_WRITE = fUNCTION_NOTICE_WRITE;
	}
	public boolean isMENU_GLUE() {
		return MENU_GLUE;
	}
	public void setMENU_GLUE(boolean mENU_GLUE) {
		MENU_GLUE = mENU_GLUE;
	}
	public boolean isFUNCTION_GLUE_WRITE() {
		return FUNCTION_GLUE_WRITE;
	}
	public void setFUNCTION_GLUE_WRITE(boolean fUNCTION_GLUE_WRITE) {
		FUNCTION_GLUE_WRITE = fUNCTION_GLUE_WRITE;
	}
	public boolean isFUNCTION_GLUE_WRITE_NOTICE() {
		return FUNCTION_GLUE_WRITE_NOTICE;
	}
	public void setFUNCTION_GLUE_WRITE_NOTICE(boolean fUNCTION_GLUE_WRITE_NOTICE) {
		FUNCTION_GLUE_WRITE_NOTICE = fUNCTION_GLUE_WRITE_NOTICE;
	}
	public boolean isFUNCTION_GLUE_WRITE_QNA() {
		return FUNCTION_GLUE_WRITE_QNA;
	}
	public void setFUNCTION_GLUE_WRITE_QNA(boolean fUNCTION_GLUE_WRITE_QNA) {
		FUNCTION_GLUE_WRITE_QNA = fUNCTION_GLUE_WRITE_QNA;
	}
	public boolean isFUNCTION_GLUE_REPLY_BOARD_QNA() {
		return FUNCTION_GLUE_REPLY_BOARD_QNA;
	}
	public void setFUNCTION_GLUE_REPLY_BOARD_QNA(
			boolean fUNCTION_GLUE_REPLY_BOARD_QNA) {
		FUNCTION_GLUE_REPLY_BOARD_QNA = fUNCTION_GLUE_REPLY_BOARD_QNA;
	}
	public boolean isFUNCTION_GLUE_WRITE_FAQ() {
		return FUNCTION_GLUE_WRITE_FAQ;
	}
	public void setFUNCTION_GLUE_WRITE_FAQ(boolean fUNCTION_GLUE_WRITE_FAQ) {
		FUNCTION_GLUE_WRITE_FAQ = fUNCTION_GLUE_WRITE_FAQ;
	}
	public boolean isFUNCTION_GLUE_WRITE_TECH() {
		return FUNCTION_GLUE_WRITE_TECH;
	}
	public void setFUNCTION_GLUE_WRITE_TECH(boolean fUNCTION_GLUE_WRITE_TECH) {
		FUNCTION_GLUE_WRITE_TECH = fUNCTION_GLUE_WRITE_TECH;
	}
    public boolean isFUNCTION_GLUE_WRITE_OLDTECH() {
        return FUNCTION_GLUE_WRITE_OLDTECH;
    }
    public void setFUNCTION_GLUE_WRITE_OLDTECH(boolean fUNCTION_GLUE_WRITE_OLDTECH) {
        FUNCTION_GLUE_WRITE_OLDTECH = fUNCTION_GLUE_WRITE_OLDTECH;
    }
	public boolean isFUNCTION_GLUE_REPLY() {
		return FUNCTION_GLUE_REPLY;
	}
	public void setFUNCTION_GLUE_REPLY(boolean fUNCTION_GLUE_REPLY) {
		FUNCTION_GLUE_REPLY = fUNCTION_GLUE_REPLY;
	}
	public boolean isMENU_GLUEMASTER() {
		return MENU_GLUEMASTER;
	}
	public void setMENU_GLUEMASTER(boolean mENU_GLUEMASTER) {
		MENU_GLUEMASTER = mENU_GLUEMASTER;
	}
	public boolean isFUNCTION_GLUEMASTER_WRITE() {
		return FUNCTION_GLUEMASTER_WRITE;
	}
	public void setFUNCTION_GLUEMASTER_WRITE(boolean fUNCTION_GLUEMASTER_WRITE) {
		FUNCTION_GLUEMASTER_WRITE = fUNCTION_GLUEMASTER_WRITE;
	}
	public boolean isFUNCTION_GLUEMASTER_WRITE_NOTICE() {
		return FUNCTION_GLUEMASTER_WRITE_NOTICE;
	}
	public void setFUNCTION_GLUEMASTER_WRITE_NOTICE(
			boolean fUNCTION_GLUEMASTER_WRITE_NOTICE) {
		FUNCTION_GLUEMASTER_WRITE_NOTICE = fUNCTION_GLUEMASTER_WRITE_NOTICE;
	}
	public boolean isFUNCTION_GLUEMASTER_WRITE_QNA() {
		return FUNCTION_GLUEMASTER_WRITE_QNA;
	}
	public void setFUNCTION_GLUEMASTER_WRITE_QNA(
			boolean fUNCTION_GLUEMASTER_WRITE_QNA) {
		FUNCTION_GLUEMASTER_WRITE_QNA = fUNCTION_GLUEMASTER_WRITE_QNA;
	}
	public boolean isFUNCTION_GLUEMASTER_REPLY_BOARD_QNA() {
		return FUNCTION_GLUEMASTER_REPLY_BOARD_QNA;
	}
	public void setFUNCTION_GLUEMASTER_REPLY_BOARD_QNA(
			boolean fUNCTION_GLUEMASTER_REPLY_BOARD_QNA) {
		FUNCTION_GLUEMASTER_REPLY_BOARD_QNA = fUNCTION_GLUEMASTER_REPLY_BOARD_QNA;
	}
	public boolean isFUNCTION_GLUEMASTER_WRITE_FAQ() {
		return FUNCTION_GLUEMASTER_WRITE_FAQ;
	}
	public void setFUNCTION_GLUEMASTER_WRITE_FAQ(
			boolean fUNCTION_GLUEMASTER_WRITE_FAQ) {
		FUNCTION_GLUEMASTER_WRITE_FAQ = fUNCTION_GLUEMASTER_WRITE_FAQ;
	}
	public boolean isFUNCTION_GLUEMASTER_WRITE_TECH() {
		return FUNCTION_GLUEMASTER_WRITE_TECH;
	}
	public void setFUNCTION_GLUEMASTER_WRITE_TECH(
			boolean fUNCTION_GLUEMASTER_WRITE_TECH) {
		FUNCTION_GLUEMASTER_WRITE_TECH = fUNCTION_GLUEMASTER_WRITE_TECH;
	}
	public boolean isFUNCTION_GLUEMASTER_REPLY() {
		return FUNCTION_GLUEMASTER_REPLY;
	}
	public void setFUNCTION_GLUEMASTER_REPLY(boolean fUNCTION_GLUEMASTER_REPLY) {
		FUNCTION_GLUEMASTER_REPLY = fUNCTION_GLUEMASTER_REPLY;
	}
	public boolean isMENU_UCUBE() {
		return MENU_UCUBE;
	}
	public void setMENU_UCUBE(boolean mENU_UCUBE) {
		MENU_UCUBE = mENU_UCUBE;
	}
	public boolean isFUNCTION_UCUBE_WRITE() {
		return FUNCTION_UCUBE_WRITE;
	}
	public void setFUNCTION_UCUBE_WRITE(boolean fUNCTION_UCUBE_WRITE) {
		FUNCTION_UCUBE_WRITE = fUNCTION_UCUBE_WRITE;
	}
	public boolean isFUNCTION_UCUBE_WRITE_NOTICE() {
		return FUNCTION_UCUBE_WRITE_NOTICE;
	}
	public void setFUNCTION_UCUBE_WRITE_NOTICE(boolean fUNCTION_UCUBE_WRITE_NOTICE) {
		FUNCTION_UCUBE_WRITE_NOTICE = fUNCTION_UCUBE_WRITE_NOTICE;
	}
	public boolean isFUNCTION_UCUBE_WRITE_QNA() {
		return FUNCTION_UCUBE_WRITE_QNA;
	}
	public void setFUNCTION_UCUBE_WRITE_QNA(boolean fUNCTION_UCUBE_WRITE_QNA) {
		FUNCTION_UCUBE_WRITE_QNA = fUNCTION_UCUBE_WRITE_QNA;
	}
	public boolean isFUNCTION_UCUBE_REPLY_BOARD_QNA() {
		return FUNCTION_UCUBE_REPLY_BOARD_QNA;
	}
	public void setFUNCTION_UCUBE_REPLY_BOARD_QNA(
			boolean fUNCTION_UCUBE_REPLY_BOARD_QNA) {
		FUNCTION_UCUBE_REPLY_BOARD_QNA = fUNCTION_UCUBE_REPLY_BOARD_QNA;
	}
	public boolean isFUNCTION_UCUBE_WRITE_FAQ() {
		return FUNCTION_UCUBE_WRITE_FAQ;
	}
	public void setFUNCTION_UCUBE_WRITE_FAQ(boolean fUNCTION_UCUBE_WRITE_FAQ) {
		FUNCTION_UCUBE_WRITE_FAQ = fUNCTION_UCUBE_WRITE_FAQ;
	}
	public boolean isFUNCTION_UCUBE_WRITE_TECH() {
		return FUNCTION_UCUBE_WRITE_TECH;
	}
	public void setFUNCTION_UCUBE_WRITE_TECH(boolean fUNCTION_UCUBE_WRITE_TECH) {
		FUNCTION_UCUBE_WRITE_TECH = fUNCTION_UCUBE_WRITE_TECH;
	}
	public boolean isFUNCTION_UCUBE_REPLY() {
		return FUNCTION_UCUBE_REPLY;
	}
	public void setFUNCTION_UCUBE_REPLY(boolean fUNCTION_UCUBE_REPLY) {
		FUNCTION_UCUBE_REPLY = fUNCTION_UCUBE_REPLY;
	}
	public boolean isMENU_SOLUTION_UPLOAD() {
		return MENU_SOLUTION_UPLOAD;
	}
	public void setMENU_SOLUTION_UPLOAD(boolean mENU_SOLUTION_UPLOAD) {
		MENU_SOLUTION_UPLOAD = mENU_SOLUTION_UPLOAD;
	}
	public boolean isFUNCTION_SOLUTION_UPLOAD_GLUE() {
		return FUNCTION_SOLUTION_UPLOAD_GLUE;
	}
	public void setFUNCTION_SOLUTION_UPLOAD_GLUE(
			boolean fUNCTION_SOLUTION_UPLOAD_GLUE) {
		FUNCTION_SOLUTION_UPLOAD_GLUE = fUNCTION_SOLUTION_UPLOAD_GLUE;
	}
	public boolean isFUNCTION_SOLUTION_UPLOAD_GLUEMASTER() {
		return FUNCTION_SOLUTION_UPLOAD_GLUEMASTER;
	}
	public void setFUNCTION_SOLUTION_UPLOAD_GLUEMASTER(
			boolean fUNCTION_SOLUTION_UPLOAD_GLUEMASTER) {
		FUNCTION_SOLUTION_UPLOAD_GLUEMASTER = fUNCTION_SOLUTION_UPLOAD_GLUEMASTER;
	}
	public boolean isFUNCTION_SOLUTION_UPLOAD_UCUBE() {
		return FUNCTION_SOLUTION_UPLOAD_UCUBE;
	}
	public void setFUNCTION_SOLUTION_UPLOAD_UCUBE(
			boolean fUNCTION_SOLUTION_UPLOAD_UCUBE) {
		FUNCTION_SOLUTION_UPLOAD_UCUBE = fUNCTION_SOLUTION_UPLOAD_UCUBE;
	}
	public boolean isFUNCTION_SOLUTION_UPLOAD_POSBEE() {
		return FUNCTION_SOLUTION_UPLOAD_POSBEE;
	}
	public void setFUNCTION_SOLUTION_UPLOAD_POSBEE(
			boolean fUNCTION_SOLUTION_UPLOAD_POSBEE) {
		FUNCTION_SOLUTION_UPLOAD_POSBEE = fUNCTION_SOLUTION_UPLOAD_POSBEE;
	}
	public boolean isFUNCTION_SOLUTION_UPLOAD_ETC() {
		return FUNCTION_SOLUTION_UPLOAD_ETC;
	}
	public void setFUNCTION_SOLUTION_UPLOAD_ETC(boolean fUNCTION_SOLUTION_UPLOAD_ETC) {
		FUNCTION_SOLUTION_UPLOAD_ETC = fUNCTION_SOLUTION_UPLOAD_ETC;
	}
	public boolean isFUNCTION_SOLUTION_UPLOAD_ORDER_COMPANY() {
		return FUNCTION_SOLUTION_UPLOAD_ORDER_COMPANY;
	}
	public void setFUNCTION_SOLUTION_UPLOAD_ORDER_COMPANY(
			boolean fUNCTION_SOLUTION_UPLOAD_ORDER_COMPANY) {
		FUNCTION_SOLUTION_UPLOAD_ORDER_COMPANY = fUNCTION_SOLUTION_UPLOAD_ORDER_COMPANY;
	}
	public boolean isFUNCTION_SOLUTION_UPLOAD_CUSTOM_USER() {
		return FUNCTION_SOLUTION_UPLOAD_CUSTOM_USER;
	}
	public void setFUNCTION_SOLUTION_UPLOAD_CUSTOM_USER(
			boolean fUNCTION_SOLUTION_UPLOAD_CUSTOM_USER) {
		FUNCTION_SOLUTION_UPLOAD_CUSTOM_USER = fUNCTION_SOLUTION_UPLOAD_CUSTOM_USER;
	}
	public boolean isMENU_PRESENTATION() {
		return MENU_PRESENTATION;
	}
	public void setMENU_PRESENTATION(boolean mENU_PRESENTATION) {
		MENU_PRESENTATION = mENU_PRESENTATION;
	}
	public boolean isMENU_GUEST_PACKAGE_DOWNLOAD() {
		return MENU_GUEST_PACKAGE_DOWNLOAD;
	}
	public void setMENU_GUEST_PACKAGE_DOWNLOAD(boolean mENU_GUEST_PACKAGE_DOWNLOAD) {
		MENU_GUEST_PACKAGE_DOWNLOAD = mENU_GUEST_PACKAGE_DOWNLOAD;
	}
	public boolean isMENU_USER_PACKAGE_DOWNLOAD() {
		return MENU_USER_PACKAGE_DOWNLOAD;
	}
	public void setMENU_USER_PACKAGE_DOWNLOAD(boolean mENU_USER_PACKAGE_DOWNLOAD) {
		MENU_USER_PACKAGE_DOWNLOAD = mENU_USER_PACKAGE_DOWNLOAD;
	}
	public boolean isMENU_MANAGEMENT() {
		return MENU_MANAGEMENT;
	}
	public void setMENU_MANAGEMENT(boolean mENU_MANAGEMENT) {
		MENU_MANAGEMENT = mENU_MANAGEMENT;
	}
	public boolean isSUB_MENU_MANAGEMENT_COMPLETE() {
		return SUB_MENU_MANAGEMENT_COMPLETE;
	}
	public void setSUB_MENU_MANAGEMENT_COMPLETE(boolean sUB_MENU_MANAGEMENT_COMPLETE) {
		SUB_MENU_MANAGEMENT_COMPLETE = sUB_MENU_MANAGEMENT_COMPLETE;
	}
	public boolean isFUNCTION_MANAGEMENT_INPUT_USER() {
		return FUNCTION_MANAGEMENT_INPUT_USER;
	}
	public void setFUNCTION_MANAGEMENT_INPUT_USER(
			boolean fUNCTION_MANAGEMENT_INPUT_USER) {
		FUNCTION_MANAGEMENT_INPUT_USER = fUNCTION_MANAGEMENT_INPUT_USER;
	}
	public boolean isSUB_MENU_MANAGEMENT_PROGRESS() {
		return SUB_MENU_MANAGEMENT_PROGRESS;
	}
	public void setSUB_MENU_MANAGEMENT_PROGRESS(boolean sUB_MENU_MANAGEMENT_PROGRESS) {
		SUB_MENU_MANAGEMENT_PROGRESS = sUB_MENU_MANAGEMENT_PROGRESS;
	}
	public boolean isFUNCTION_PROGRESS_INPUT_USER() {
		return FUNCTION_PROGRESS_INPUT_USER;
	}
	public void setFUNCTION_PROGRESS_INPUT_USER(boolean fUNCTION_PROGRESS_INPUT_USER) {
		FUNCTION_PROGRESS_INPUT_USER = fUNCTION_PROGRESS_INPUT_USER;
	}
	public boolean isFUNCTION_PROGRESS_COMMENT() {
		return FUNCTION_PROGRESS_COMMENT;
	}
	public void setFUNCTION_PROGRESS_COMMENT(boolean fUNCTION_PROGRESS_COMMENT) {
		FUNCTION_PROGRESS_COMMENT = fUNCTION_PROGRESS_COMMENT;
	}
	
}
