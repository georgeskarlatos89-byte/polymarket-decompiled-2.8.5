package com.google.mlkit.common.model;

import android.text.TextUtils;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import defpackage.arn;
import defpackage.dkn;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class RemoteModel {
    private final String zzc;
    private final BaseModel zzd;
    private final ModelType zze;
    private String zzf;
    private static final Map zzb = new EnumMap(BaseModel.class);
    public static final Map zza = new EnumMap(BaseModel.class);

    public RemoteModel(String str, BaseModel baseModel, ModelType modelType) {
        boolean z;
        boolean isEmpty = TextUtils.isEmpty(str);
        if (baseModel == null) {
            z = false;
        } else {
            z = true;
        }
        arn.a("One of cloud model name and base model cannot be empty", isEmpty == z);
        this.zzc = str;
        this.zzd = baseModel;
        this.zze = modelType;
    }

    public boolean baseModelHashMatches(String str) {
        BaseModel baseModel = this.zzd;
        if (baseModel == null) {
            return false;
        }
        return str.equals(zzb.get(baseModel));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoteModel)) {
            return false;
        }
        RemoteModel remoteModel = (RemoteModel) obj;
        if (dkn.b(this.zzc, remoteModel.zzc) && dkn.b(this.zzd, remoteModel.zzd) && dkn.b(this.zze, remoteModel.zze)) {
            return true;
        }
        return false;
    }

    public String getModelHash() {
        return this.zzf;
    }

    public String getModelName() {
        return this.zzc;
    }

    public String getModelNameForBackend() {
        String str = this.zzc;
        if (str != null) {
            return str;
        }
        return (String) zza.get(this.zzd);
    }

    public ModelType getModelType() {
        return this.zze;
    }

    public String getUniqueModelNameForPersist() {
        String str = this.zzc;
        if (str != null) {
            return str;
        }
        return "COM.GOOGLE.BASE_".concat(String.valueOf((String) zza.get(this.zzd)));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzc, this.zzd, this.zze});
    }

    public boolean isBaseModel() {
        if (this.zzd != null) {
            return true;
        }
        return false;
    }

    public void setModelHash(String str) {
        this.zzf = str;
    }

    public String toString() {
        zzq zzb2 = zzr.zzb("RemoteModel");
        zzb2.zza("modelName", this.zzc);
        zzb2.zza("baseModel", this.zzd);
        zzb2.zza("modelType", this.zze);
        return zzb2.toString();
    }
}
