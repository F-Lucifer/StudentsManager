package com.until;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringToTime {
	public Timestamp Totime(String time) {
		Timestamp Time = null;
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Time = new Timestamp(format.parse(time).getTime());
			return Time;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Time;
		}
	}

	public Date ToDate(String time) {
		Date Time = null;
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Time = new Date(format.parse(time).getTime());
			return Time;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Time;
		}
	}

	public String ThreeTime() {
		Date dNow = new Date(); // ��ǰʱ��
		Date dBefore = new Date();
		Calendar calendar = Calendar.getInstance(); // �õ�����
		calendar.setTime(dNow);// �ѵ�ǰʱ�丳������
		calendar.add(Calendar.MONTH, -2); // ����Ϊǰ3��
		calendar.set(Calendar.DATE, 1);
		dBefore = calendar.getTime(); // �õ�ǰ3�µ�ʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // ����ʱ���ʽ
		String defaultStartDate = sdf.format(dBefore); // ��ʽ��ǰ3�µ�ʱ��
		String defaultEndDate = sdf.format(dNow); // ��ʽ����ǰʱ��
		return defaultStartDate;
	}
	public String TwoDayTime() {
		Date dNow = new Date(); // ��ǰʱ��
		Date dBefore = new Date();
		Calendar calendar = Calendar.getInstance(); // �õ�����
		calendar.setTime(dNow);// �ѵ�ǰʱ�丳������
		calendar.add(Calendar.DATE, -2);
		dBefore = calendar.getTime(); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // ����ʱ���ʽ
		String defaultStartDate = sdf.format(dBefore); // ��ʽ��ǰǰһ���ʱ��
		//String defaultEndDate = sdf.format(dNow); // ��ʽ����ǰʱ��
		//System.out.println(defaultStartDate);
		return defaultStartDate;
	}

}
