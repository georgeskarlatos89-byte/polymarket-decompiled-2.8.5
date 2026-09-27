package defpackage;

import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MemberInfoEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl;
import io.getstream.chat.android.models.SyncStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public interface jcc {
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[LOOP:1: B:27:0x0086->B:29:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object a(MessageDao_Impl messageDao_Impl, List list, Continuation continuation) {
        hcc hccVar;
        int i;
        Iterator it;
        idc idcVar;
        if (continuation instanceof hcc) {
            hccVar = (hcc) continuation;
            int i2 = hccVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hccVar.o = i2 - Integer.MIN_VALUE;
                Object obj = hccVar.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = hccVar.o;
                if (i == 0) {
                    if (i == 1) {
                        list = hccVar.l;
                        messageDao_Impl = hccVar.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    hccVar.k = messageDao_Impl;
                    hccVar.l = list;
                    hccVar.o = 1;
                    obj = messageDao_Impl.insertMessageInnerEntities(list, hccVar);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                for (Object obj2 : (List) obj) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (((Number) obj2).longValue() == -1) {
                        idcVar = (idc) list.get(i3);
                    } else {
                        idcVar = null;
                    }
                    if (idcVar != null) {
                        arrayList.add(idcVar);
                    }
                    i3 = i4;
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    messageDao_Impl.updateMessageInnerEntity((idc) it.next());
                }
                return Unit.INSTANCE;
            }
        }
        hccVar = new hcc(messageDao_Impl, continuation);
        Object obj3 = hccVar.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = hccVar.o;
        if (i == 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        int i32 = 0;
        while (r11.hasNext()) {
        }
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x010d, code lost:
    
        if (r10.insertReactions(r11, r0) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        if (r9.upsertMessageInnerEntities(r2, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed A[LOOP:0: B:19:0x00e7->B:21:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[LOOP:1: B:28:0x0095->B:30:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[LOOP:2: B:33:0x00b5->B:35:0x00bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object b(jcc jccVar, List list, Continuation continuation) {
        fcc fccVar;
        u85 u85Var;
        int i;
        Iterator it;
        ArrayList arrayList;
        Iterator it2;
        jcc jccVar2;
        List<ddc> list2;
        if (continuation instanceof fcc) {
            fccVar = (fcc) continuation;
            int i2 = fccVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fccVar.o = i2 - Integer.MIN_VALUE;
                Object obj = fccVar.m;
                u85Var = u85.COROUTINE_SUSPENDED;
                i = fccVar.o;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                List list3 = fccVar.l;
                                ResultKt.a(obj);
                                return Unit.INSTANCE;
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list2 = fccVar.l;
                        jccVar2 = fccVar.k;
                        ResultKt.a(obj);
                        ArrayList arrayList2 = new ArrayList();
                        for (ddc ddcVar : list2) {
                            CollectionsKt.o(arrayList2, CollectionsKt.i0(ddcVar.d, ddcVar.c));
                        }
                        fccVar.k = null;
                        fccVar.l = null;
                        fccVar.o = 3;
                    } else {
                        list = fccVar.l;
                        jccVar = fccVar.k;
                        ResultKt.a(obj);
                    }
                } else {
                    ResultKt.a(obj);
                    List list4 = list;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.w(list4));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((ddc) it3.next()).a);
                    }
                    fccVar.k = jccVar;
                    fccVar.l = list;
                    fccVar.o = 1;
                }
                List list5 = list;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.w(list5));
                it = list5.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((ddc) it.next()).a.a);
                }
                jccVar.deleteAttachments(arrayList4);
                arrayList = new ArrayList();
                it2 = list5.iterator();
                while (it2.hasNext()) {
                    CollectionsKt.o(arrayList, ((ddc) it2.next()).b);
                }
                fccVar.k = jccVar;
                fccVar.l = list;
                fccVar.o = 2;
                if (jccVar.insertAttachments(arrayList, fccVar) != u85Var) {
                    List list6 = list;
                    jccVar2 = jccVar;
                    list2 = list6;
                    ArrayList arrayList22 = new ArrayList();
                    while (r9.hasNext()) {
                    }
                    fccVar.k = null;
                    fccVar.l = null;
                    fccVar.o = 3;
                }
                return u85Var;
            }
        }
        fccVar = new fcc(jccVar, continuation);
        Object obj2 = fccVar.m;
        u85Var = u85.COROUTINE_SUSPENDED;
        i = fccVar.o;
        if (i == 0) {
        }
        List list52 = list;
        ArrayList arrayList42 = new ArrayList(CollectionsKt.w(list52));
        it = list52.iterator();
        while (it.hasNext()) {
        }
        jccVar.deleteAttachments(arrayList42);
        arrayList = new ArrayList();
        it2 = list52.iterator();
        while (it2.hasNext()) {
        }
        fccVar.k = jccVar;
        fccVar.l = list;
        fccVar.o = 2;
        if (jccVar.insertAttachments(arrayList, fccVar) != u85Var) {
        }
        return u85Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v6, types: [jcc] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:10:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object c(MessageDao_Impl messageDao_Impl, List list, Continuation continuation) {
        gcc gccVar;
        int i;
        int i2;
        ArrayList arrayList;
        Iterator it;
        int i3;
        if (continuation instanceof gcc) {
            gccVar = (gcc) continuation;
            int i4 = gccVar.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gccVar.r = i4 - Integer.MIN_VALUE;
                Object obj = gccVar.p;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = gccVar.r;
                if (i == 0) {
                    if (i == 1) {
                        int i5 = gccVar.o;
                        i3 = gccVar.n;
                        Iterator it2 = gccVar.m;
                        Collection collection = gccVar.l;
                        ?? r5 = gccVar.k;
                        ResultKt.a(obj);
                        int i6 = i5;
                        messageDao_Impl = r5;
                        ArrayList arrayList2 = collection;
                        CollectionsKt.o(arrayList2, (Iterable) obj);
                        it = it2;
                        i2 = i6;
                        arrayList = arrayList2;
                        if (it.hasNext()) {
                            List list2 = (List) it.next();
                            gccVar.k = messageDao_Impl;
                            gccVar.l = arrayList;
                            gccVar.m = it;
                            gccVar.n = i3;
                            gccVar.o = i2;
                            gccVar.r = 1;
                            Object selectChunked = messageDao_Impl.selectChunked(list2, gccVar);
                            if (selectChunked == u85Var) {
                                return u85Var;
                            }
                            int i7 = i2;
                            it2 = it;
                            obj = selectChunked;
                            arrayList2 = arrayList;
                            i6 = i7;
                            CollectionsKt.o(arrayList2, (Iterable) obj);
                            it = it2;
                            i2 = i6;
                            arrayList = arrayList2;
                            if (it.hasNext()) {
                                return arrayList;
                            }
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    ArrayList v = CollectionsKt.v(j9g.MAX_BIND_PARAMETER_CNT, list);
                    i2 = 0;
                    arrayList = new ArrayList();
                    it = v.iterator();
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        gccVar = new gcc(messageDao_Impl, continuation);
        Object obj2 = gccVar.p;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = gccVar.r;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object d(MessageDao_Impl messageDao_Impl, idc idcVar, Continuation continuation) {
        icc iccVar;
        Object obj;
        int i;
        if (continuation instanceof icc) {
            iccVar = (icc) continuation;
            int i2 = iccVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iccVar.o = i2 - Integer.MIN_VALUE;
                obj = iccVar.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = iccVar.o;
                if (i == 0) {
                    if (i == 1) {
                        idcVar = iccVar.l;
                        messageDao_Impl = iccVar.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    iccVar.k = messageDao_Impl;
                    iccVar.l = idcVar;
                    iccVar.o = 1;
                    obj = messageDao_Impl.insertMessageInnerEntity(idcVar, iccVar);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                if (((Number) obj).longValue() == -1) {
                    messageDao_Impl.updateMessageInnerEntity(idcVar);
                }
                return Unit.INSTANCE;
            }
        }
        iccVar = new icc(messageDao_Impl, continuation);
        obj = iccVar.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = iccVar.o;
        if (i == 0) {
        }
        if (((Number) obj).longValue() == -1) {
        }
        return Unit.INSTANCE;
    }

    Object deleteAll(Continuation continuation);

    Object deleteAllDrafts(Continuation continuation);

    void deleteAttachments(List list);

    void deleteAttachmentsChunked(List list);

    Object deleteChannelMessagesBefore(String str, Date date, Continuation continuation);

    Object deleteDraftMessageByCid(String str, Continuation continuation);

    Object deleteDraftMessageByParentId(String str, Continuation continuation);

    Object deleteMessage(String str, String str2, Continuation continuation);

    Object deleteMessages(String str, Continuation continuation);

    Object deleteMessages(List list, Continuation continuation);

    Object insert(List list, Continuation continuation);

    Object insertAttachments(List list, Continuation continuation);

    Object insertDraftMessages(ny6 ny6Var, Continuation continuation);

    Object insertMessageInnerEntities(List list, Continuation continuation);

    Object insertMessageInnerEntity(idc idcVar, Continuation continuation);

    Object insertReactions(List list, Continuation continuation);

    Object messagesForChannel(String str, int i, Continuation continuation);

    Object messagesForChannelEqualOrNewerThan(String str, int i, Date date, Continuation continuation);

    Object messagesForChannelEqualOrOlderThan(String str, int i, Date date, Continuation continuation);

    Object messagesForChannelNewerThan(String str, int i, Date date, Continuation continuation);

    Object messagesForChannelOlderThan(String str, int i, Date date, Continuation continuation);

    Object messagesForThread(String str, int i, Continuation continuation);

    Object select(String str, Continuation continuation);

    Object select(List list, Continuation continuation);

    Object selectByCidAndUserId(String str, String str2, Continuation continuation);

    Object selectBySyncStatus(SyncStatus syncStatus, int i, Continuation continuation);

    Object selectBySyncStatusOrTypeForChannel(String str, List list, List list2, Continuation continuation);

    Object selectByUserId(String str, Continuation continuation);

    Object selectChunked(List list, Continuation continuation);

    Object selectDraftMessageByCid(String str, Continuation continuation);

    Object selectDraftMessageByParentId(String str, Continuation continuation);

    Object selectDraftMessages(Continuation continuation);

    Object selectIdsBySyncStatus(SyncStatus syncStatus, int i, Continuation continuation);

    Object selectMessagesWithPoll(String str, Continuation continuation);

    Object updateMemberByCidAndUserId(String str, String str2, MemberInfoEntity memberInfoEntity, Continuation continuation);

    void updateMessageInnerEntity(idc idcVar);

    Object upsertMessageInnerEntities(List list, Continuation continuation);
}
