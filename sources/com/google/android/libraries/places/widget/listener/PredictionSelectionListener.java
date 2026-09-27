package com.google.android.libraries.places.widget.listener;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/google/android/libraries/places/widget/listener/PredictionSelectionListener;", "", "onPredictionSelected", "", "prediction", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "sessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "onError", "errorStatus", "Lcom/google/android/gms/common/api/Status;", "java.com.google.android.libraries.places.widget.listener_prediction_listener_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PredictionSelectionListener {
    void onError(Status errorStatus);

    void onPredictionSelected(AutocompletePrediction prediction, AutocompleteSessionToken sessionToken);
}
