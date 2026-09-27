package defpackage;

import com.polymarket.clients.ClientChatMessage;
import com.polymarket.clients.ClientChatReactor;
import com.polymarket.usviewmodels.USChatViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class nv3 {
    public final USChatViewModel a;
    public final ClientChatMessage b;
    public final gdh c;
    public final LinkedHashSet d;
    public int e;
    public final kvd f;
    public boolean g;
    public int h;

    public nv3(USChatViewModel uSChatViewModel, ClientChatMessage clientChatMessage) {
        uSChatViewModel.getClass();
        clientChatMessage.getClass();
        this.a = uSChatViewModel;
        this.b = clientChatMessage;
        this.c = new gdh();
        this.d = new LinkedHashSet();
        this.f = ikl.c(Boolean.TRUE);
    }

    public static String d(ClientChatReactor clientChatReactor) {
        return ace.m(clientChatReactor.getContent().getReactionId(), "|", clientChatReactor.getUser().getId());
    }

    public final void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ClientChatReactor clientChatReactor = (ClientChatReactor) it.next();
            if (this.d.add(d(clientChatReactor))) {
                arrayList.add(clientChatReactor);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            String reactionId = ((ClientChatReactor) next).getContent().getReactionId();
            Object obj = linkedHashMap.get(reactionId);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(reactionId, obj);
            }
            ((List) obj).add(next);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            gdh gdhVar = this.c;
            List list3 = (List) gdhVar.get(str);
            if (list3 == null) {
                list3 = CollectionsKt.emptyList();
            }
            gdhVar.put(str, CollectionsKt.i0(list3, list2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:10:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, int i, q55 q55Var) {
        lv3 lv3Var;
        int i2;
        int i3;
        if (q55Var instanceof lv3) {
            lv3Var = (lv3) q55Var;
            int i4 = lv3Var.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lv3Var.o = i4 - Integer.MIN_VALUE;
                Object obj = lv3Var.m;
                Object obj2 = u85.COROUTINE_SUSPENDED;
                i2 = lv3Var.o;
                if (i2 == 0) {
                    if (i2 == 1) {
                        int i5 = lv3Var.l;
                        String str2 = lv3Var.k;
                        ResultKt.a(obj);
                        i = i5;
                        str = str2;
                        if (this.g) {
                            return Unit.INSTANCE;
                        }
                        if (((Boolean) this.f.getValue()).booleanValue()) {
                            List list = (List) this.c.get(str);
                            if (list != null) {
                                i3 = list.size();
                            } else {
                                i3 = 0;
                            }
                            if (i3 >= Math.min(i, 30)) {
                                return Unit.INSTANCE;
                            }
                            lv3Var.k = str;
                            lv3Var.l = i;
                            lv3Var.o = 1;
                            if (c(lv3Var) == obj2) {
                                return obj2;
                            }
                            if (this.g) {
                            }
                            if (((Boolean) this.f.getValue()).booleanValue()) {
                            }
                        } else {
                            return Unit.INSTANCE;
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    if (((Boolean) this.f.getValue()).booleanValue()) {
                    }
                }
            }
        }
        lv3Var = new lv3(this, q55Var);
        Object obj3 = lv3Var.m;
        Object obj22 = u85.COROUTINE_SUSPENDED;
        i2 = lv3Var.o;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(2:29|(1:31)(2:32|33))(2:9|(2:27|28)(3:13|14|(1:16)))|18|(1:20)(1:26)|21|22|23|24))|42|6|7|(0)(0)|18|(0)(0)|21|22|23|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
    
        r9 = r8.h + 1;
        r8.h = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
    
        if (r9 >= 3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        r3.setValue(java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(q55 q55Var) {
        mv3 mv3Var;
        int i;
        List list;
        boolean z;
        if (q55Var instanceof mv3) {
            mv3Var = (mv3) q55Var;
            int i2 = mv3Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mv3Var.m = i2 - Integer.MIN_VALUE;
                Object obj = mv3Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = mv3Var.m;
                kvd kvdVar = this.f;
                if (i == 0) {
                    try {
                        if (i == 1) {
                            ResultKt.a(obj);
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } finally {
                        this.g = false;
                    }
                } else {
                    ResultKt.a(obj);
                    if (!this.g && ((Boolean) kvdVar.getValue()).booleanValue()) {
                        this.g = true;
                        USChatViewModel uSChatViewModel = this.a;
                        ClientChatMessage clientChatMessage = this.b;
                        int i3 = this.e;
                        mv3Var.m = 1;
                        obj = uSChatViewModel.loadReactors(clientChatMessage, i3, 25, mv3Var);
                        if (obj == u85Var) {
                            return u85Var;
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
                list = (List) obj;
                this.e += list.size();
                if (list.size() != 25) {
                    z = true;
                } else {
                    z = false;
                }
                kvdVar.setValue(Boolean.valueOf(z));
                this.h = 0;
                a(list);
                return Unit.INSTANCE;
            }
        }
        mv3Var = new mv3(this, q55Var);
        Object obj2 = mv3Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = mv3Var.m;
        kvd kvdVar2 = this.f;
        if (i == 0) {
        }
        list = (List) obj2;
        this.e += list.size();
        if (list.size() != 25) {
        }
        kvdVar2.setValue(Boolean.valueOf(z));
        this.h = 0;
        a(list);
        return Unit.INSTANCE;
    }
}
