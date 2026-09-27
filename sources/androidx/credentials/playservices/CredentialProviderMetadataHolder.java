package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import defpackage.je5;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderMetadataHolder;", "Landroid/app/Service;", "<init>", "()V", "je5", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {
    public final je5 a = new Binder();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.a;
    }
}
