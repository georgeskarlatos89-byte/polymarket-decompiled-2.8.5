package androidx.work.impl;

import android.content.Context;
import defpackage.cok;
import defpackage.cpk;
import defpackage.f74;
import defpackage.j9g;
import defpackage.pok;
import defpackage.rok;
import defpackage.s1f;
import defpackage.sl6;
import defpackage.uii;
import defpackage.ynf;
import defpackage.yok;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Lj9g;", "<init>", "()V", "Lyok;", "workSpecDao", "()Lyok;", "Lsl6;", "dependencyDao", "()Lsl6;", "Lcpk;", "workTagDao", "()Lcpk;", "Luii;", "systemIdInfoDao", "()Luii;", "Lpok;", "workNameDao", "()Lpok;", "Lrok;", "workProgressDao", "()Lrok;", "Ls1f;", "preferenceDao", "()Ls1f;", "Lynf;", "rawWorkInfoDao", "()Lynf;", "Companion", "cok", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class WorkDatabase extends j9g {
    public static final cok Companion = new Object();

    public static final WorkDatabase create(Context context, Executor executor, f74 f74Var, boolean z) {
        Companion.getClass();
        return cok.a(context, executor, f74Var, z);
    }

    public abstract sl6 dependencyDao();

    public abstract s1f preferenceDao();

    public abstract ynf rawWorkInfoDao();

    public abstract uii systemIdInfoDao();

    public abstract pok workNameDao();

    public abstract rok workProgressDao();

    public abstract yok workSpecDao();

    public abstract cpk workTagDao();
}
