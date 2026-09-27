package defpackage;

import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class lum extends u2 {
    public Task a;

    @Override // defpackage.u2
    public final void afterDone() {
        this.a = null;
    }

    @Override // defpackage.u2
    public final String pendingToString() {
        Task task = this.a;
        if (task == null) {
            return "";
        }
        return task.toString();
    }
}
