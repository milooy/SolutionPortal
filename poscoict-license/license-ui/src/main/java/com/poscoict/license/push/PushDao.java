package com.poscoict.license.push;

import java.util.List;
import java.util.Map;

import com.poscoict.license.vo.PushMessage;
import com.poscoict.license.vo.PushSubscription;

public interface PushDao {

	int getMessageCount();
	
	void insertPushMessage(PushMessage push);
	
	List<Map<String, Object>> getUnsentPushMessages();
	
	List<Map<String, Object>> getTheMostRecentPushMessages();
	
	void updateSentMessages();
	
	void insertPushSubscription(PushSubscription pushSubscription);
	
	List<Map<String, Object>> getSubscriptionUserList();
}
