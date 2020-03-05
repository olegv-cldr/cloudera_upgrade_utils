package com.streever.hive.perf;

import java.util.Date;

public class Statistic {
    private Date timestamp;
    private Long recordCount;
    private Long size = 0l;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(Long recordCount) {
        this.recordCount = recordCount;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public static Statistic build(Long recordCount) {
        Statistic stats = new Statistic();
        stats.setTimestamp(new Date());
        stats.setRecordCount(recordCount);
        return stats;
    }

    public static Statistic build(Long recordCount, Long size) {
        Statistic stats = new Statistic();
        stats.setTimestamp(new Date());
        stats.setRecordCount(recordCount);
        stats.setSize(size);
        return stats;
    }

}
