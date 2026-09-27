package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.mlkit.common.model.RemoteModel;
import defpackage.arn;
import defpackage.bk4;
import defpackage.ck4;
import defpackage.pl6;
import defpackage.uk4;
import defpackage.yk4;
import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class SharedPrefManager {
    public static final ck4 COMPONENT;
    public static final String PREF_FILE = "com.google.mlkit.internal";
    protected final Context zza;

    static {
        bk4 b = ck4.b(SharedPrefManager.class);
        b.a(pl6.a(MlKitContext.class));
        b.a(pl6.a(Context.class));
        b.f = new yk4() { // from class: com.google.mlkit.common.sdkinternal.zzs
            @Override // defpackage.yk4
            public final Object create(uk4 uk4Var) {
                return new SharedPrefManager((Context) uk4Var.b(Context.class));
            }
        };
        COMPONENT = b.b();
    }

    public SharedPrefManager(Context context) {
        this.zza = context;
    }

    public static SharedPrefManager getInstance(MlKitContext mlKitContext) {
        return (SharedPrefManager) mlKitContext.get(SharedPrefManager.class);
    }

    public synchronized void clearDownloadingModelInfo(RemoteModel remoteModel) {
        String downloadingModelHash = getDownloadingModelHash(remoteModel);
        zza().edit().remove("downloading_model_id_" + remoteModel.getUniqueModelNameForPersist()).remove("downloading_model_hash_" + remoteModel.getUniqueModelNameForPersist()).remove("downloading_model_type_" + downloadingModelHash).remove("downloading_begin_time_" + remoteModel.getUniqueModelNameForPersist()).remove("model_first_use_time_" + remoteModel.getUniqueModelNameForPersist()).apply();
    }

    public synchronized void clearIncompatibleModelInfo(RemoteModel remoteModel) {
        zza().edit().remove("bad_hash_" + remoteModel.getUniqueModelNameForPersist()).remove("app_version").apply();
    }

    public synchronized void clearLatestModelHash(RemoteModel remoteModel) {
        zza().edit().remove("current_model_hash_" + remoteModel.getUniqueModelNameForPersist()).commit();
    }

    public synchronized String getDownloadingModelHash(RemoteModel remoteModel) {
        return zza().getString("downloading_model_hash_" + remoteModel.getUniqueModelNameForPersist(), null);
    }

    public synchronized Long getDownloadingModelId(RemoteModel remoteModel) {
        long j = zza().getLong("downloading_model_id_" + remoteModel.getUniqueModelNameForPersist(), -1L);
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public synchronized String getIncompatibleModelHash(RemoteModel remoteModel) {
        return zza().getString("bad_hash_" + remoteModel.getUniqueModelNameForPersist(), null);
    }

    public synchronized String getLatestModelHash(RemoteModel remoteModel) {
        return zza().getString("current_model_hash_" + remoteModel.getUniqueModelNameForPersist(), null);
    }

    public synchronized String getMlSdkInstanceId() {
        String string = zza().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        zza().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    public synchronized long getModelDownloadBeginTimeMs(RemoteModel remoteModel) {
        return zza().getLong("downloading_begin_time_" + remoteModel.getUniqueModelNameForPersist(), 0L);
    }

    public synchronized long getModelFirstUseTimeMs(RemoteModel remoteModel) {
        return zza().getLong("model_first_use_time_" + remoteModel.getUniqueModelNameForPersist(), 0L);
    }

    public synchronized String getPreviousAppVersion() {
        return zza().getString("app_version", null);
    }

    public synchronized void setDownloadingModelInfo(long j, ModelInfo modelInfo) {
        String modelNameForPersist = modelInfo.getModelNameForPersist();
        String modelHash = modelInfo.getModelHash();
        zza().edit().putString("downloading_model_hash_" + modelNameForPersist, modelHash).putLong("downloading_model_id_" + modelNameForPersist, j).putLong("downloading_begin_time_" + modelNameForPersist, SystemClock.elapsedRealtime()).apply();
    }

    public synchronized void setIncompatibleModelInfo(RemoteModel remoteModel, String str, String str2) {
        zza().edit().putString("bad_hash_" + remoteModel.getUniqueModelNameForPersist(), str).putString("app_version", str2).apply();
    }

    public synchronized void setLatestModelHash(RemoteModel remoteModel, String str) {
        zza().edit().putString("current_model_hash_" + remoteModel.getUniqueModelNameForPersist(), str).apply();
    }

    public synchronized void setModelFirstUseTimeMs(RemoteModel remoteModel, long j) {
        zza().edit().putLong("model_first_use_time_" + remoteModel.getUniqueModelNameForPersist(), j).apply();
    }

    public final SharedPreferences zza() {
        return this.zza.getSharedPreferences(PREF_FILE, 0);
    }

    public final synchronized String zzb(String str, long j) {
        SharedPreferences zza;
        zza = zza();
        arn.h(str);
        return zza.getString(String.format("cached_local_model_hash_%1s_%2s", str, Long.valueOf(j)), null);
    }

    public final synchronized void zzc(String str, long j, String str2) {
        SharedPreferences.Editor edit = zza().edit();
        arn.h(str);
        edit.putString(String.format("cached_local_model_hash_%1s_%2s", str, Long.valueOf(j)), str2).apply();
    }
}
