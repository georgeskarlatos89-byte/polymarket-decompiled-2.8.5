package defpackage;

import com.google.mlkit.common.MlKitException;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class n75 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qqc b;

    public /* synthetic */ n75(int i, qqc qqcVar) {
        this.a = i;
        this.b = qqcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = true;
        qqc qqcVar = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) qqcVar.getValue();
                bool.booleanValue();
                return bool;
            case 1:
                qqcVar.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 2:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 3:
                qqcVar.setValue(Boolean.valueOf(!((Boolean) qqcVar.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 4:
                return DatePickerQuestionKt.i(qqcVar);
            case 5:
                return DatePickerQuestionKt.f(qqcVar);
            case 6:
                return DropDownQuestionKt.f(qqcVar);
            case 7:
                return DropDownQuestionKt.a(qqcVar);
            case 8:
                qqcVar.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 9:
                qqcVar.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 10:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 11:
                qqcVar.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 12:
                qqcVar.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 13:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                qqcVar.setValue(Boolean.valueOf(!((Boolean) qqcVar.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 16:
                qqcVar.setValue(jp8.Picker);
                return Unit.INSTANCE;
            case 17:
                qqcVar.setValue(null);
                return Unit.INSTANCE;
            case MlKitException.UNSUPPORTED /* 18 */:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                qqcVar.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 20:
                Unit unit = Unit.INSTANCE;
                qqcVar.setValue(unit);
                return unit;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                ((ts7) qqcVar.getValue()).getClass();
                if (!Intrinsics.areEqual("PrimaryNotEditable", "PrimaryNotEditable") && !Intrinsics.areEqual("PrimaryNotEditable", "PrimaryEditable")) {
                    z = Intrinsics.areEqual("PrimaryNotEditable", "SecondaryEditable") ? Intrinsics.areEqual("PrimaryNotEditable", "SecondaryEditable") : false;
                }
                if (z) {
                    qqcVar.setValue(new Object());
                }
                return Unit.INSTANCE;
            case 22:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 23:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 24:
                qqcVar.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 25:
                return FinAnswerRowKt.a(qqcVar);
            case 26:
                return FinAnswerRowKt.d(qqcVar);
            case 27:
                qqcVar.setValue(null);
                return Unit.INSTANCE;
            case 28:
                qqcVar.setValue(null);
                return Unit.INSTANCE;
            default:
                qqcVar.setValue(null);
                return Unit.INSTANCE;
        }
    }
}
