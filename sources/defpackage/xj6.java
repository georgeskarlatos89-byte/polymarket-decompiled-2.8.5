package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class xj6 implements dk6, phi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xj6(ql1 ql1Var, Iterable iterable, my0 my0Var, long j) {
        this.a = 2;
        this.b = ql1Var;
        this.e = iterable;
        this.d = my0Var;
        this.c = j;
    }

    @Override // defpackage.dk6
    public ScheduledFuture a(ba6 ba6Var) {
        int i = this.a;
        Object obj = this.d;
        long j = this.c;
        Object obj2 = this.e;
        ck6 ck6Var = (ck6) this.b;
        switch (i) {
            case 0:
                return ck6Var.b.schedule(new ak6(ck6Var, (Runnable) obj2, ba6Var, 1), j, (TimeUnit) obj);
            default:
                return ck6Var.b.schedule(new bk6(ck6Var, (Callable) obj2, ba6Var, 0), j, (TimeUnit) obj);
        }
    }

    @Override // defpackage.phi
    public Object execute() {
        ql1 ql1Var = (ql1) this.b;
        Iterable iterable = (Iterable) this.e;
        my0 my0Var = (my0) this.d;
        kcg kcgVar = (kcg) ql1Var.d;
        kcgVar.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(kcg.A(iterable));
            SQLiteDatabase e = kcgVar.e();
            e.beginTransaction();
            try {
                e.compileStatement(concat).execute();
                Cursor rawQuery = e.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        kcgVar.y(rawQuery.getInt(0), brb.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                e.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                e.setTransactionSuccessful();
            } finally {
                e.endTransaction();
            }
        }
        kcgVar.o(new hcg(((g74) ql1Var.h).getTime() + this.c, my0Var));
        return null;
    }

    public /* synthetic */ xj6(ck6 ck6Var, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = ck6Var;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }
}
