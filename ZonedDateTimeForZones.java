String d1="22-01-2015 10:15:55 AM";
  
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        ZonedDateTime dt1= LocalDateTime.parse(d1,dtf).atZone(ZoneId.of("Australia/Sydney"));
        ZonedDateTime dt2=dt1.plusHours(8).withZoneSameLocal(ZoneId.of("Asia/Ho_Chi_Minh"));

        System.out.println("dt1: "+dt1+" \ndt2: "+dt2);
