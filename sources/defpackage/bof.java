package defpackage;

import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public interface bof {
    Object delete(hof hofVar, Continuation continuation);

    Object deleteAll(Continuation continuation);

    Object insert(hof hofVar, Continuation continuation);

    Object selectIdsSyncStatus(SyncStatus syncStatus, int i, Continuation continuation);

    Object selectReactionById(int i, Continuation continuation);

    Object selectUserReactionToMessage(String str, String str2, String str3, Continuation continuation);

    Object setDeleteAt(String str, String str2, Date date, Continuation continuation);
}
