package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zkl extends usk implements ell {
    @Override // defpackage.ell
    public final void beginAdUnitExposure(String str, long j) {
        Parcel L = L();
        L.writeString(str);
        L.writeLong(j);
        N(L, 23);
    }

    @Override // defpackage.ell
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel L = L();
        L.writeString(str);
        L.writeString(str2);
        dhl.b(L, bundle);
        N(L, 9);
    }

    @Override // defpackage.ell
    public final void endAdUnitExposure(String str, long j) {
        Parcel L = L();
        L.writeString(str);
        L.writeLong(j);
        N(L, 24);
    }

    @Override // defpackage.ell
    public final void generateEventId(rll rllVar) {
        Parcel L = L();
        dhl.c(L, rllVar);
        N(L, 22);
    }

    @Override // defpackage.ell
    public final void getCachedAppInstanceId(rll rllVar) {
        Parcel L = L();
        dhl.c(L, rllVar);
        N(L, 19);
    }

    @Override // defpackage.ell
    public final void getConditionalUserProperties(String str, String str2, rll rllVar) {
        Parcel L = L();
        L.writeString(str);
        L.writeString(str2);
        dhl.c(L, rllVar);
        N(L, 10);
    }

    @Override // defpackage.ell
    public final void getCurrentScreenClass(rll rllVar) {
        Parcel L = L();
        dhl.c(L, rllVar);
        N(L, 17);
    }

    @Override // defpackage.ell
    public final void getCurrentScreenName(rll rllVar) {
        Parcel L = L();
        dhl.c(L, rllVar);
        N(L, 16);
    }

    @Override // defpackage.ell
    public final void getGmpAppId(rll rllVar) {
        Parcel L = L();
        dhl.c(L, rllVar);
        N(L, 21);
    }

    @Override // defpackage.ell
    public final void getMaxUserProperties(String str, rll rllVar) {
        Parcel L = L();
        L.writeString(str);
        dhl.c(L, rllVar);
        N(L, 6);
    }

    @Override // defpackage.ell
    public final void getUserProperties(String str, String str2, boolean z, rll rllVar) {
        Parcel L = L();
        L.writeString(str);
        L.writeString(str2);
        ClassLoader classLoader = dhl.a;
        L.writeInt(z ? 1 : 0);
        dhl.c(L, rllVar);
        N(L, 5);
    }

    @Override // defpackage.ell
    public final void initialize(xj9 xj9Var, unl unlVar, long j) {
        Parcel L = L();
        dhl.c(L, xj9Var);
        dhl.b(L, unlVar);
        L.writeLong(j);
        N(L, 1);
    }

    @Override // defpackage.ell
    public final void initializeWithElapsedTime(xj9 xj9Var, unl unlVar, long j, long j2) {
        Parcel L = L();
        dhl.c(L, xj9Var);
        dhl.b(L, unlVar);
        L.writeLong(j);
        L.writeLong(j2);
        N(L, 60);
    }

    @Override // defpackage.ell
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel L = L();
        L.writeString(str);
        L.writeString(str2);
        dhl.b(L, bundle);
        L.writeInt(z ? 1 : 0);
        L.writeInt(1);
        L.writeLong(j);
        L.writeLong(j2);
        N(L, 59);
    }

    @Override // defpackage.ell
    public final void logHealthData(int i, String str, xj9 xj9Var, xj9 xj9Var2, xj9 xj9Var3) {
        Parcel L = L();
        L.writeInt(5);
        L.writeString("Error with data collection. Data lost.");
        dhl.c(L, xj9Var);
        dhl.c(L, xj9Var2);
        dhl.c(L, xj9Var3);
        N(L, 33);
    }

    @Override // defpackage.ell
    public final void onActivityCreatedByScionActivityInfo(bol bolVar, Bundle bundle, long j) {
        Parcel L = L();
        dhl.b(L, bolVar);
        dhl.b(L, bundle);
        L.writeLong(j);
        N(L, 53);
    }

    @Override // defpackage.ell
    public final void onActivityDestroyedByScionActivityInfo(bol bolVar, long j) {
        Parcel L = L();
        dhl.b(L, bolVar);
        L.writeLong(j);
        N(L, 54);
    }

    @Override // defpackage.ell
    public final void onActivityPausedByScionActivityInfo(bol bolVar, long j) {
        Parcel L = L();
        dhl.b(L, bolVar);
        L.writeLong(j);
        N(L, 55);
    }

    @Override // defpackage.ell
    public final void onActivityResumedByScionActivityInfo(bol bolVar, long j) {
        Parcel L = L();
        dhl.b(L, bolVar);
        L.writeLong(j);
        N(L, 56);
    }

    @Override // defpackage.ell
    public final void onActivitySaveInstanceStateByScionActivityInfo(bol bolVar, rll rllVar, long j) {
        Parcel L = L();
        dhl.b(L, bolVar);
        dhl.c(L, rllVar);
        L.writeLong(j);
        N(L, 57);
    }

    @Override // defpackage.ell
    public final void onActivityStartedByScionActivityInfo(bol bolVar, long j) {
        Parcel L = L();
        dhl.b(L, bolVar);
        L.writeLong(j);
        N(L, 51);
    }

    @Override // defpackage.ell
    public final void onActivityStoppedByScionActivityInfo(bol bolVar, long j) {
        Parcel L = L();
        dhl.b(L, bolVar);
        L.writeLong(j);
        N(L, 52);
    }

    @Override // defpackage.ell
    public final void retrieveAndUploadBatches(gml gmlVar) {
        Parcel L = L();
        dhl.c(L, gmlVar);
        N(L, 58);
    }

    @Override // defpackage.ell
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel L = L();
        dhl.b(L, bundle);
        L.writeLong(j);
        N(L, 8);
    }

    @Override // defpackage.ell
    public final void setCurrentScreenByScionActivityInfo(bol bolVar, String str, String str2, long j) {
        Parcel L = L();
        dhl.b(L, bolVar);
        L.writeString(str);
        L.writeString(str2);
        L.writeLong(j);
        N(L, 50);
    }

    @Override // defpackage.ell
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.ell
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel L = L();
        ClassLoader classLoader = dhl.a;
        L.writeInt(z ? 1 : 0);
        L.writeLong(j);
        N(L, 11);
    }

    @Override // defpackage.ell
    public final void setUserId(String str, long j) {
        Parcel L = L();
        L.writeString(str);
        L.writeLong(j);
        N(L, 7);
    }

    @Override // defpackage.ell
    public final void setUserProperty(String str, String str2, xj9 xj9Var, boolean z, long j) {
        Parcel L = L();
        L.writeString(str);
        L.writeString(str2);
        dhl.c(L, xj9Var);
        L.writeInt(z ? 1 : 0);
        L.writeLong(j);
        N(L, 4);
    }
}
