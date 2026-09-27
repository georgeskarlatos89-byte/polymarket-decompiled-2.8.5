package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gok {
    public final nok a;
    public final d7f b;
    public final yok c;

    static {
        dm0.j("WMFgUpdater");
    }

    public gok(WorkDatabase workDatabase, d7f d7fVar, nok nokVar) {
        this.b = d7fVar;
        this.a = nokVar;
        this.c = workDatabase.workSpecDao();
    }
}
