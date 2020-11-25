package group2.tier2csep3.service.componentService;

import group2.tier2csep3.model.component.ComponentList;
import group2.tier2csep3.networking.componentNetworking.Client_Component;
import org.springframework.stereotype.Service;

@Service
public class ComponentServiceImpl implements ComponentService {

    private ComponentList componentsList;
    private Client_Component client_component;

    public ComponentServiceImpl(Client_Component client_component)
    {
        this.componentsList = new ComponentList();
        this.client_component = client_component;
    }

    @Override
    public ComponentList getAllComponents() {
        return client_component.getAllComponents();
    }

}