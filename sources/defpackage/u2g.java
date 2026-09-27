package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u2g extends dgc {
    public final /* synthetic */ int a = 1;
    public final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2g(Context context) {
        super(9, 10);
        context.getClass();
        this.b = context;
    }

    @Override // defpackage.dgc
    public final void migrate(sci sciVar) {
        int i = this.a;
        Context context = this.b;
        sciVar.getClass();
        switch (i) {
            case 0:
                if (this.endVersion >= 10) {
                    sciVar.B0(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                sciVar.t("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = 0;
                    long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j = 1;
                    }
                    sciVar.r();
                    try {
                        sciVar.B0(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                        sciVar.B0(new Object[]{"reschedule_needed", Long.valueOf(j)});
                        sharedPreferences.edit().clear().apply();
                        sciVar.J();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    sciVar.r();
                    try {
                        sciVar.B0(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        sciVar.B0(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        sciVar.J();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2g(Context context, int i, int i2) {
        super(i, i2);
        context.getClass();
        this.b = context;
    }
}
