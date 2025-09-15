select w.id from Weather w
join Weather e
on  DateDiff(w.recordDate,e.recordDate)=1
where w.temperature>e.temperature;
