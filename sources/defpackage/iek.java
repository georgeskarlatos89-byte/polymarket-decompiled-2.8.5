package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.mlkit.common.MlKitException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class iek implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ iek(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 646
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            Method dump skipped, instructions count: 1990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iek.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new jek[i];
            case 1:
                return new pgk[i];
            case 2:
                return new wgk[i];
            case 3:
                return new rz8[i];
            case 4:
                return new BitmapTeleporter[i];
            case 5:
                return new h64[i];
            case 6:
                return new sjc[i];
            case 7:
                return new tpi[i];
            case 8:
                return new wjc[i];
            case 9:
                return new c2l[i];
            case 10:
                return new GoogleSignInAccount[i];
            case 11:
                return new f2l[i];
            case 12:
                return new xjc[i];
            case 13:
                return new td0[i];
            case 14:
                return new GoogleSignInOptions[i];
            case 15:
                return new e3l[i];
            case 16:
                return new h3l[i];
            case 17:
                return new n3l[i];
            case MlKitException.UNSUPPORTED /* 18 */:
                return new sfc[i];
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new u3l[i];
            case 20:
                return new v3l[i];
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new SignInAccount[i];
            case 22:
                return new wc1[i];
            case 23:
                return new xc1[i];
            case 24:
                return new dv8[i];
            case 25:
                return new sc1[i];
            case 26:
                return new tc1[i];
            case 27:
                return new uc1[i];
            case 28:
                return new vc1[i];
            default:
                return new SignInConfiguration[i];
        }
    }
}
