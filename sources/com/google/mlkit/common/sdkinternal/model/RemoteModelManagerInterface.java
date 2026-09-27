package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface RemoteModelManagerInterface<RemoteT extends RemoteModel> {
    Task<Void> deleteDownloadedModel(RemoteT remotet);

    Task<Void> download(RemoteT remotet, DownloadConditions downloadConditions);

    Task<Set<RemoteT>> getDownloadedModels();

    Task<Boolean> isModelDownloaded(RemoteT remotet);
}
