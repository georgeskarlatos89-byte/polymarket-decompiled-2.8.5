package io.intercom.android.sdk.survey.ui.questiontype;

import defpackage.eb4;
import defpackage.oq4;
import defpackage.pq4;
import defpackage.sr8;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.ComposableSingletons$DatePickerQuestionKt$lambda-6$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class ComposableSingletons$DatePickerQuestionKt$lambda6$1 implements Function2<pq4, Integer, Unit> {
    public static final ComposableSingletons$DatePickerQuestionKt$lambda6$1 INSTANCE = new ComposableSingletons$DatePickerQuestionKt$lambda6$1();

    public static /* synthetic */ Unit a(Answer answer) {
        return invoke$lambda$1$lambda$0(answer);
    }

    private static final Unit invoke$lambda$1$lambda$0(Answer answer) {
        answer.getClass();
        return Unit.INSTANCE;
    }

    public final void invoke(pq4 pq4Var, int i) {
        if ((i & 3) == 2) {
            sr8 sr8Var = (sr8) pq4Var;
            if (sr8Var.F()) {
                sr8Var.Y();
                return;
            }
        }
        SurveyData.Step.Question.DatePickerQuestionModel datePickerQuestionModel = new SurveyData.Step.Question.DatePickerQuestionModel("123", eb4.c(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Choose date")), true);
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.e0(1421060921);
        Object Q = sr8Var2.Q();
        if (Q == oq4.a) {
            Q = new Object();
            sr8Var2.o0(Q);
        }
        sr8Var2.s(false);
        DatePickerQuestionKt.DatePickerQuestion(null, datePickerQuestionModel, null, (Function1) Q, null, sr8Var2, 3072, 21);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var, Integer num) {
        invoke(pq4Var, num.intValue());
        return Unit.INSTANCE;
    }
}
