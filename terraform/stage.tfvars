environment = "stage"

cluster_name = "enterprise-product-stage-eks"

node_group_name = "enterprise-product-stage-node-group"

node_labels = {
  Environment = "stage"
  Project     = "enterprise-product-deployment"
}

additional_tags = {
  Owner       = "Ravi"
  ManagedBy   = "Terraform"
  Environment = "stage"
  Project     = "enterprise-product-deployment"
}