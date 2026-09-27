package com.google.mlkit.common.model;

import android.text.TextUtils;
import com.google.mlkit.common.sdkinternal.ModelType;
import defpackage.arn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class CustomRemoteModel extends RemoteModel {
    private final RemoteModelSource zzb;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class Builder {
        private final RemoteModelSource zza;

        public Builder(RemoteModelSource remoteModelSource) {
            arn.h(remoteModelSource);
            this.zza = remoteModelSource;
        }

        public CustomRemoteModel build() {
            return new CustomRemoteModel(this.zza, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CustomRemoteModel(RemoteModelSource remoteModelSource, zza zzaVar) {
        super(r4, null, ModelType.CUSTOM);
        String zza;
        if (TextUtils.isEmpty(remoteModelSource.zza())) {
            zza = "no_model_name";
        } else {
            zza = remoteModelSource.zza();
        }
        this.zzb = remoteModelSource;
    }

    public RemoteModelSource getRemoteModelSource() {
        return this.zzb;
    }
}
