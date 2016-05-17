# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from .sub_resource import SubResource


class SubProduct(SubResource):
    """SubProduct

    Variables are only populated by the server, and will be ignored when
    sending a request.

    :ivar id: Sub Resource Id
    :vartype id: str
    :param provisioning_state:
    :type provisioning_state: str
    :ivar provisioning_state_values: Possible values include: 'Succeeded',
     'Failed', 'canceled', 'Accepted', 'Creating', 'Created', 'Updating',
     'Updated', 'Deleting', 'Deleted', 'OK'
    :vartype provisioning_state_values: str
    """ 

    _validation = {
        'id': {'readonly': True},
        'provisioning_state_values': {'readonly': True},
    }

    _attribute_map = {
        'id': {'key': 'id', 'type': 'str'},
        'provisioning_state': {'key': 'properties.provisioningState', 'type': 'str'},
        'provisioning_state_values': {'key': 'properties.provisioningStateValues', 'type': 'str'},
    }

    def __init__(self, provisioning_state=None):
        super(SubProduct, self).__init__()
        self.provisioning_state = provisioning_state
        self.provisioning_state_values = None
