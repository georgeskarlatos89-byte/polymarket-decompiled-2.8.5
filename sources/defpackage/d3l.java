package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class d3l extends l3l {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ GoogleApiActivity b;

    public d3l(Intent intent, GoogleApiActivity googleApiActivity) {
        this.a = intent;
        this.b = googleApiActivity;
    }

    @Override // defpackage.l3l
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
