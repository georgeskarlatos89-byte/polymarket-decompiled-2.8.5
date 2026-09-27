package defpackage;

import com.polymarket.data.APIFailureActionUS;
import com.polymarket.usviewmodels.TransactionDetailViewModel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class haj {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TransactionDetailViewModel.HeaderIcon.values().length];
        try {
            iArr[TransactionDetailViewModel.HeaderIcon.success.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransactionDetailViewModel.HeaderIcon.pending.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransactionDetailViewModel.HeaderIcon.declined.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[APIFailureActionUS.Button.Style.values().length];
        try {
            iArr2[APIFailureActionUS.Button.Style.primary.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[APIFailureActionUS.Button.Style.secondary.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[APIFailureActionUS.Button.Style.text.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
