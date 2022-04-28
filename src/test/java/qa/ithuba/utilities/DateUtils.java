package qa.ithuba.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateUtils
{
    public static Calendar cal = new java.util.GregorianCalendar();
    public static int year = cal.get(Calendar.YEAR);
    public static Calendar rightNow = Calendar.getInstance();
    public static SimpleDateFormat df1 = new SimpleDateFormat("MM");
    public static SimpleDateFormat df2 = new SimpleDateFormat("MMM");
    public static String day = df1.format(rightNow.getTime());
    public static String month = df2.format(rightNow.getTime());
    public static Calendar calNew = new java.util.GregorianCalendar();
    public static int yearNew = calNew.get(Calendar.YEAR);
    public static Calendar rightNowNnew = Calendar.getInstance();
    public static SimpleDateFormat df1New = new SimpleDateFormat("MM");
    public static SimpleDateFormat df2New = new SimpleDateFormat("MMM");
    public static String dayNew = df1.format(rightNow.getTime());
    public static String monthNew = df2.format(rightNow.getTime());

    public static String getTodaysDate()
    {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDateTime now = LocalDateTime.now();
	return dtf.format(now);
    }

    public static boolean isCurrenTimeAfterEndtime() throws ParseException
    {
	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
	Date EndTime = dateFormat.parse("23:50");
	Date CurrentTime = dateFormat.parse(dateFormat.format(new Date()));
	return CurrentTime.after(EndTime);
    }

    public static String bfxGetDateTime()
    {
	// String day = df1.format(rightNow.getTime());
	String month = df2.format(rightNow.getTime());
	LocalTime CurrentTime = LocalTime.now();
	String HHMM = CurrentTime.toString();
	HHMM = HHMM.substring(0, 5);
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDateTime now = LocalDateTime.now();
	String todayD = dtf.format(now);
	String Date = todayD.substring(0, 2);
	String printToFile = Date + "-" + month + "-" + year + "@" + HHMM.replace(":", "_");
	// System.out.println(printToFile);
	return printToFile;
    }

    public static String Folder_Name_Todays_Date()
    {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	LocalDateTime now = LocalDateTime.now();
	String Date_A = dtf.format(now);
	System.out.println(dtf.format(now));
	return Date_A;
    }

    public static String bfxGetDateTime_Import_Export_Number(String product, boolean isOutward)
    {
	String month = df1.format(rightNow.getTime());
	LocalTime CurrentTime = LocalTime.now();
	String HHMM = CurrentTime.toString();
	HHMM = HHMM.substring(0, 5);
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDateTime now = LocalDateTime.now();
	String todayD = dtf.format(now);
	String Date = todayD.substring(0, 2);
	String Outwards_Import_Export = "";
	if (isOutward)
	// if ("TRO".equalsIgnoreCase(product))
	{
	    Outwards_Import_Export = "INV" + year + month + Date + "0000001";
	} else
	{
	}
	return Outwards_Import_Export;
    }

    public static String getFutureDateFormat(int increaseDateByInt, String format)
    {
	long increaseDateBy;
	increaseDateBy = increaseDateByInt;
	System.out.println("increaseDateBy" + increaseDateBy);
	Date CurrentDate = new Date();
	// System.out.println(CurrentDate);
	SimpleDateFormat formatter1 = new SimpleDateFormat(format);
	System.out.println("Increase - by=" + (increaseDateBy) * 24 * 60 * 60 * 1000);
	long ltime = CurrentDate.getTime() + ((increaseDateBy) * 24 * 60 * 60 * 1000);
	Date SpotDate = new Date(ltime);
	String SpotDate1 = formatter1.format(SpotDate);
	System.out.println("Date = " + SpotDate1);
	return SpotDate1;
    }

//    public static String get_Future_or_Past_Date_from_String(String String_Value_Date, String format)
//    {
//	try
//	{
//	    String String_Need_Change = String_Value_Date;
//	    String Date_in_Format = "";
//	   // int days = NumberUtils.Convert_String_To_Int(NumberUtils.Extract_Number_From_String(String_Need_Change));
//	    if (String_Need_Change.contains("+"))
//	    {
//		Date_in_Format = getFutureDateFormat(days, format);
//		System.out.println("Date in Future = " + Date_in_Format);
//	    } else if (String_Need_Change.contains("-"))
//	    {
//		Date_in_Format = getFutureDateFormat(-days, format);
//		System.out.println("Returning Date in Past = " + Date_in_Format);
//	    } else if (String_Need_Change.equals("0"))
//	    {
//		Date_in_Format = getFutureDateFormat(days, format);
//		System.out.println("Returning Todays Date  " + Date_in_Format);
//	    } else
//	    {
//		System.out.println("Will return What received");
//		Date_in_Format = String_Value_Date;
//	    }
//	    return Date_in_Format;
//	} catch (Exception e)
//	{
//	    System.err.println("Exception in get_Future_or_Past_Date_from_String method");
//	    throw e;
//	}
//    }
//
//    public static String get_Future_or_Past_Month_from_String(String String_Value_Date, String format)
//    {
//	try
//	{
//	    String String_Need_Change = String_Value_Date;
//	    String Date_in_Format = "";
//	    int days = NumberUtils.Convert_String_To_Int(NumberUtils.Extract_Number_From_String(String_Need_Change))
//		    * 30;
//	    if (String_Need_Change.contains("+"))
//	    {
//		Date_in_Format = getFutureDateFormat(days, format);
//		System.out.println("Date in Future = " + Date_in_Format);
//	    } else if (String_Need_Change.contains("-"))
//	    {
//		Date_in_Format = getFutureDateFormat(-days, format);
//		System.out.println("Returning Date in Past = " + Date_in_Format);
//	    } else if (String_Need_Change.equals("0"))
//	    {
//		Date_in_Format = getFutureDateFormat(days, format);
//		System.out.println("Returning Todays Date  " + Date_in_Format);
//	    } else
//	    {
//		System.out.println("Will return What received");
//		Date_in_Format = String_Value_Date;
//	    }
//	    return Date_in_Format;
//	} catch (Exception e)
//	{
//	    System.out.println("Exception in get_Future_or_Past_Month_from_String method");
//	    throw e;
//	}
//    }

    public static String Bfx_Get_Date_Time_4_Email()
    {
	String month = df2New.format(rightNowNnew.getTime());
	LocalTime CurrentTime = LocalTime.now();
	String HHMM = CurrentTime.toString();
	HHMM = HHMM.substring(0, 5);
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDateTime now = LocalDateTime.now();
	String todayD = dtf.format(now);
	String Date = todayD.substring(0, 2);
	String printToFile = Date + "-" + month + "-" + yearNew + "@" + HHMM.replace(":", "_");
	// System.out.println(printToFile);
	return printToFile;
    }

    public static String Bfx_Get_Date_Time_Seconds()
    {
	// String day = df1.format(rightNow.getTime());
	String month = df2.format(rightNow.getTime());
	LocalTime CurrentTime = LocalTime.now();
	// String HHMM = CurrentTime.toString();
	String SSHHMM = CurrentTime.toString();
	// HHMM = HHMM.substring(0, 5);
	SSHHMM = SSHHMM.substring(0, 8);
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDateTime now = LocalDateTime.now();
	String todayD = dtf.format(now);
	String Date = todayD.substring(0, 2);
	String printToFile = Date + "-" + month + "-" + year + "@" + SSHHMM.replace(":", "_");
	System.out.println(printToFile = Date + "-" + month + "-" + year + "@" + SSHHMM.replace(":", "_"));
	// System.out.println(printToFile);
	return printToFile;
    }
    public static boolean Check_Midnighht_Alarm()
    {
	boolean we_have_Time = false;
	try
	{
	    if (DateUtils.isCurrenTimeAfterEndtime())
	    {
		we_have_Time = false;
	    } else
	    {
		we_have_Time = true;
	    }
	} catch (Exception e)
	{
	}
	return we_have_Time;
    }

    public static boolean Check_Rate_Cutoff_Alarm()
    {
	boolean we_have_Time = false;
	try
	{
	    if (DateUtils.isCurrenTimeAfterEndtime())
	    {
		we_have_Time = false;
	    } else
	    {
		we_have_Time = true;
	    }
	} catch (Exception e)
	{
	}
	return we_have_Time;
    }
}
