package defpackage;

import com.google.mlkit.common.MlKitException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rdb extends tf {
    public static final rdb b = new rdb(0);
    public static final rdb c = new rdb(1);
    public static final rdb d = new rdb(2);
    public static final rdb e = new rdb(3);
    public static final rdb f = new rdb(4);
    public static final rdb g = new rdb(5);
    public static final rdb h = new rdb(6);
    public static final rdb i = new rdb(7);
    public static final rdb j = new rdb(8);
    public static final rdb k = new rdb(9);
    public static final rdb l = new rdb(10);
    public static final rdb m = new rdb(11);
    public static final rdb n = new rdb(12);
    public static final rdb o = new rdb(13);
    public static final rdb p = new rdb(14);
    public static final rdb q = new rdb(15);
    public static final rdb r = new rdb(16);
    public static final rdb s = new rdb(17);
    public static final rdb t = new rdb(18);
    public static final rdb u = new rdb(19);
    public final /* synthetic */ int a;

    public /* synthetic */ rdb(int i2) {
        this.a = i2;
    }

    @Override // defpackage.fp
    public final String c() {
        switch (this.a) {
            case 0:
                return "link.account_lookup.complete";
            case 1:
                return "link.account_lookup.failure";
            case 2:
                return "link.account_refresh.failure";
            case 3:
                return "link.email_suggestion.accepted";
            case 4:
                return "link.popup.cancel";
            case 5:
                return "link.popup.error";
            case 6:
                return "link.popup.logout";
            case 7:
                return "link.popup.show";
            case 8:
                return "link.popup.skipped";
            case 9:
                return "link.popup.success";
            case 10:
                return "link.signup.checkbox_checked";
            case 11:
                return "link.signup.complete";
            case 12:
                return "link.signup.failure";
            case 13:
                return "link.signup.failure.invalidSessionState";
            case 14:
                return "link.signup.start";
            case 15:
                return "link.2fa.cancel";
            case 16:
                return "link.2fa.complete";
            case 17:
                return "link.2fa.failure";
            case MlKitException.UNSUPPORTED /* 18 */:
                return "link.2fa.start";
            default:
                return "link.2fa.start_failure";
        }
    }
}
