package defpackage;

import com.fingerprintjs.android.fpjs_pro.g;
import com.polymarket.usviewmodels.KYCConfirmInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class jla implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KYCConfirmInfoViewModel b;

    public /* synthetic */ jla(KYCConfirmInfoViewModel kYCConfirmInfoViewModel, int i) {
        this.a = i;
        this.b = kYCConfirmInfoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        KYCConfirmInfoViewModel kYCConfirmInfoViewModel = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                kYCConfirmInfoViewModel.sendInput(KYCConfirmInfoViewModel.Input.INSTANCE.onFirstNameChanged(str));
                return Unit.INSTANCE;
            case 1:
                str.getClass();
                kYCConfirmInfoViewModel.sendInput(KYCConfirmInfoViewModel.Input.INSTANCE.onLastNameChanged(str));
                return Unit.INSTANCE;
            case 2:
                str.getClass();
                kYCConfirmInfoViewModel.sendInput(KYCConfirmInfoViewModel.Input.INSTANCE.onBirthdayChanged(str));
                return Unit.INSTANCE;
            default:
                StringBuilder q = g.q(str);
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        q.append(charAt);
                    }
                }
                String sb = q.toString();
                if (sb.length() <= 9) {
                    kYCConfirmInfoViewModel.sendInput(KYCConfirmInfoViewModel.Input.INSTANCE.onSSNChanged(sb));
                }
                return Unit.INSTANCE;
        }
    }
}
