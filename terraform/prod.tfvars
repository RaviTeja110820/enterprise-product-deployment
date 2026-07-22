environment = "prod"

cluster_name = "enterprise-product-prod-eks"

node_group_name = "enterprise-product-prod-node-group"

node_labels = {
  Environment = "prod"
  Project     = "enterprise-product-deployment"
}

additional_tags = {
  Owner       = "Ravi"
  ManagedBy   = "Terraform"
  Environment = "prod"
  Project     = "enterprise-product-deployment"
}