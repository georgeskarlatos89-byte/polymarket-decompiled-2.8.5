package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class bl9 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl9 b;

    public /* synthetic */ bl9(cl9 cl9Var, int i) {
        this.a = i;
        this.b = cl9Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        int i5 = 0;
        cl9 cl9Var = this.b;
        switch (i4) {
            case 0:
                WorkDatabase workDatabase = cl9Var.a;
                Long longValue = workDatabase.preferenceDao().getLongValue("next_alarm_manager_id");
                if (longValue != null) {
                    i = (int) longValue.longValue();
                } else {
                    i = 0;
                }
                if (i != Integer.MAX_VALUE) {
                    i5 = i + 1;
                }
                workDatabase.preferenceDao().insertPreference(new r1f("next_alarm_manager_id", Long.valueOf(i5)));
                return Integer.valueOf(i);
            default:
                WorkDatabase workDatabase2 = cl9Var.a;
                Long longValue2 = workDatabase2.preferenceDao().getLongValue("next_job_scheduler_id");
                if (longValue2 != null) {
                    i2 = (int) longValue2.longValue();
                } else {
                    i2 = 0;
                }
                if (i2 == Integer.MAX_VALUE) {
                    i3 = 0;
                } else {
                    i3 = i2 + 1;
                }
                workDatabase2.preferenceDao().insertPreference(new r1f("next_job_scheduler_id", Long.valueOf(i3)));
                if (i2 >= 0 && i2 <= Integer.MAX_VALUE) {
                    i5 = i2;
                } else {
                    workDatabase2.preferenceDao().insertPreference(new r1f("next_job_scheduler_id", 1L));
                }
                return Integer.valueOf(i5);
        }
    }
}
