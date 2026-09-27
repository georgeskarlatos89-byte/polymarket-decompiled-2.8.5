package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface yok {
    int countNonFinishedContentUriTriggerWorkers();

    void delete(String str);

    List getAllEligibleWorkSpecsForScheduling(int i);

    List getEligibleWorkForScheduling(int i);

    List getEligibleWorkForSchedulingWithContentUris();

    List getInputsFromPrerequisites(String str);

    List getRecentlyCompletedWork(long j);

    List getRunningWork();

    List getScheduledWork();

    iok getState(String str);

    List getUnfinishedWorkWithName(String str);

    xok getWorkSpec(String str);

    List getWorkSpecIdAndStatesForName(String str);

    boolean hasUnfinishedWork();

    void incrementPeriodCount(String str);

    int incrementWorkSpecRunAttemptCount(String str);

    void insertWorkSpec(xok xokVar);

    int markWorkSpecScheduled(String str, long j);

    int resetScheduledState();

    void resetWorkSpecNextScheduleTimeOverride(String str, int i);

    int resetWorkSpecRunAttemptCount(String str);

    int setCancelledState(String str);

    void setLastEnqueueTime(String str, long j);

    void setOutput(String str, bo5 bo5Var);

    int setState(iok iokVar, String str);

    void setStopReason(String str, int i);
}
