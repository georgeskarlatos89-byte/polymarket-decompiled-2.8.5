package io.intercom.android.sdk.api;

import defpackage.lxd;
import defpackage.ppd;
import defpackage.ug1;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.SubmitSurveyResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\t¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/api/SurveyApi;", "", "submitSurveyStep", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/survey/model/SubmitSurveyResponse;", "surveyId", "", "options", "Lokhttp3/RequestBody;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismissSurvey", "", "submitCtaStat", "reportFailure", "fetchSurvey", "Lio/intercom/android/sdk/survey/model/FetchSurveyRequest;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SurveyApi {
    @ppd("surveys/{surveyId}/dismiss")
    Object dismissSurvey(@lxd("surveyId") String str, @ug1 RequestBody requestBody, Continuation<? super NetworkResponse<Unit>> continuation);

    @ppd("surveys/{surveyId}/fetch")
    Object fetchSurvey(@lxd("surveyId") String str, @ug1 RequestBody requestBody, Continuation<? super NetworkResponse<FetchSurveyRequest>> continuation);

    @ppd("surveys/{survey_id}/failure")
    Object reportFailure(@lxd("survey_id") String str, @ug1 RequestBody requestBody, Continuation<? super NetworkResponse<Unit>> continuation);

    @ppd("surveys/{surveyId}/action_button_clicked")
    Object submitCtaStat(@lxd("surveyId") String str, @ug1 RequestBody requestBody, Continuation<? super NetworkResponse<Unit>> continuation);

    @ppd("surveys/{surveyId}/submit")
    Object submitSurveyStep(@lxd("surveyId") String str, @ug1 RequestBody requestBody, Continuation<? super NetworkResponse<SubmitSurveyResponse>> continuation);
}
