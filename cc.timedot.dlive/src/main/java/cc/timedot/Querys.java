/*
MIT modified License

Copyright (c) 2019 Nils Kleinert

Permission is hereby granted, free of charge, to any person who receives a copy of
the Software and related documentation (the "Software") to use it without limitation,
including without limitation the right to use, copy, modify, merge it.
Persons to whom this Software is granted the right to grant such rights are subject to
the following terms and conditions:

The above copyright notice and this permission notice must be included in all copies or
partial copies of the Software.

—

THE SOFTWARE IS PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESS OR IMPLIED,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE, NON-INFRINGEMENT OR NON-INFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY DAMAGES OR OTHER CLAIMS,
WHETHER IN CONTRACT, TORT OR OTHERWISE, ARISING OUT OF OR IN CONNECTION WITH THE SOFTWARE OR
ANY OTHER USE OF THE SOFTWARE.


—

It is not allowed to create and/or redistribute a new product/project with the source code of
this software whose purpose is to provide the same functionality as this software.
 */

package cc.timedot;

public class Querys {
    static String SendStreamchatMessage = "mutation SendStreamChatMessage($input: SendStreamchatMessageInput!) { sendStreamchatMessage(input: $input) { err { code __typename } message { type ... on ChatText { id content ...VStreamChatSenderInfoFrag __typename } __typename } __typename } } fragment VStreamChatSenderInfoFrag on SenderInfo { subscribing role roomRole sender { id username displayname avatar partnerStatus __typename } __typename }";
    static String DeleteChat = "mutation DeleteChat($streamer: String!, $id: String!) { chatDelete(streamer: $streamer, id: $id) { err { code message __typename } __typename } }";
    static String FollowUser = "mutation FollowUser($streamer: String!) { follow(streamer: $streamer) { err { code message __typename } __typename } }";
    static String UnfollowUser = "mutation UnfollowUser($streamer: String!) { unfollow(streamer: $streamer) { err { code message __typename } __typename } }";
}
